package com.lyj.service;

import com.lyj.dao.DBHandle;
import com.lyj.dao.RevisedCourseDAO;
import com.lyj.dao.StudentDAO;
import com.lyj.entity.RevisedCourse;
import com.lyj.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by lyj on 2019/6/13.
 * 描述：学生选课界面
 */
@WebServlet(name = "ChooseCourseServlet")
public class ChooseCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");

        if(session.getAttribute("isLogged") != null)
        {
            String stu_no = (String)session.getAttribute("isLogged");

            // 已选修课程信息
            RevisedCourseDAO revisedCourseDAO = new RevisedCourseDAO(dbHandle);
            List<RevisedCourse> revisedCourses = revisedCourseDAO.queryByStudentNo(stu_no);
            request.setAttribute("revisedCourses", revisedCourses);

            // 可选修课程信息
            Student student = new StudentDAO(dbHandle).queryByStudentNo(stu_no).get(0);
            String major_department_no = student.getMajor_department_no();
            String minor_department_no = student.getMinor_department_no();
            String degree = student.getDegree();
            List<RevisedCourse> courses1 = revisedCourseDAO.queryByNotChooseCourse(major_department_no, degree, stu_no);
            List<RevisedCourse> courses2 = revisedCourseDAO.queryByNotChooseCourse(minor_department_no, degree, stu_no);
            courses1.addAll(courses2);
            request.setAttribute("courses", courses1);

            request.getRequestDispatcher("/choose_course.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
