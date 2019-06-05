package com.lyj.service;

import com.lyj.dao.CourseDAO;
import com.lyj.dao.DBHandle;
import com.lyj.dao.StartCourseDAO;
import com.lyj.dao.TeacherDAO;
import com.lyj.entity.Course;
import com.lyj.entity.StartCourse;
import com.lyj.entity.Teacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyj on 2019/6/5.
 * 描述：
 */
@WebServlet(name = "TeachingCourseServlet")
public class TeachingCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");

        String department_name = request.getParameter("department_name");
        String teacher_no = request.getParameter("teacher_no");

        request.setAttribute("department_name", department_name);

        List<Teacher> teachers = new TeacherDAO(dbHandle).queryByTeacherNo(teacher_no);
        request.setAttribute("teacher", teachers.get(0));

        List<StartCourse> startCourses = new StartCourseDAO(dbHandle).queryByTeacherNo(teacher_no);
        List<Course> courses = new ArrayList<>();
        if(startCourses.size() > 0)
        {
            CourseDAO courseDAO = new CourseDAO(dbHandle);
            for(StartCourse startCourse : startCourses)
            {
                List<Course> course = courseDAO.queryByCourseCode(startCourse.getCourse_code());
                courses.add(course.get(0));
            }
        }
        request.setAttribute("courses", courses);

        request.getRequestDispatcher("/teacher.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
