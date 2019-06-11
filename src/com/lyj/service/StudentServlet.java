package com.lyj.service;

import com.lyj.dao.ChooseCourseDAO;
import com.lyj.dao.CourseDAO;
import com.lyj.dao.DBHandle;
import com.lyj.dao.StudentDAO;
import com.lyj.entity.ChooseCourse;
import com.lyj.entity.Course;
import com.lyj.entity.Student;

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
 * Created by lyj on 2019/6/10.
 * 描述：
 */
@WebServlet(name = "StudentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");

        String stu_no = "20150101";
        List<Student> students = new StudentDAO(dbHandle).queryByStudentNo(stu_no);
        System.out.print(students.size());
        request.setAttribute("student", students.get(0));

        List<ChooseCourse> chooseCourses = new ChooseCourseDAO(dbHandle).queryByStudentNo(stu_no);
        List<Course> courses = new ArrayList<>();
        if(chooseCourses.size() > 0)
        {
            CourseDAO courseDAO = new CourseDAO(dbHandle);
            for(ChooseCourse chooseCourse : chooseCourses)
            {
                List<Course> course = courseDAO.queryByCourseCode(chooseCourse.getCourse_code());
                courses.add(course.get(0));
            }
        }
        request.setAttribute("chooseCourses", chooseCourses);
        request.setAttribute("courses", courses);

        request.getRequestDispatcher("/student.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
