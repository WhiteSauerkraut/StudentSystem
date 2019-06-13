package com.lyj.service;

import com.lyj.dao.ChooseCourseDAO;
import com.lyj.dao.DBHandle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by lyj on 2019/6/13.
 * 描述：
 */
@WebServlet(name = "StuRevisedCourseServlet")
public class StuRevisedCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");

        String stu_no = (String)session.getAttribute("isLogged");

        String[] revisedCourses = request.getParameterValues("revised_course");
        ChooseCourseDAO chooseCourseDAO = new ChooseCourseDAO(dbHandle);
        for (String chooseCourse : revisedCourses) {
            chooseCourseDAO.deleteByStudentNoAndCourseCode(stu_no, chooseCourse);
        }

        request.setAttribute("revised_success", "true");
        response.sendRedirect("/choose_course");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
