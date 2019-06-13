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
 * 描述：选课结果处理
 */
@WebServlet(name = "StuChooseCourseServlet")
public class StuChooseCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");

        String stu_no = (String)session.getAttribute("isLogged");

        String[] chooseCourses = request.getParameterValues("choose_course");
        ChooseCourseDAO chooseCourseDAO = new ChooseCourseDAO(dbHandle);
        for (String chooseCourse : chooseCourses) {
            chooseCourseDAO.insertByStudentNoAndCourseCode(stu_no, chooseCourse, "已选");
        }

        request.setAttribute("choose_success", "true");
        response.sendRedirect("/choose_course");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
