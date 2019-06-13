package com.lyj.service;

import com.lyj.dao.*;
import com.lyj.entity.*;

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

        // 学生个人信息
        String stu_no = (String)session.getAttribute("isLogged");
        List<Student> students = new StudentDAO(dbHandle).queryByStudentNo(stu_no);
        request.setAttribute("student", students.get(0));
        String degree;
        switch (students.get(0).getDegree())
        {
            case "0":
                degree = "本科在读";
                break;
            case "1":
                degree = "研究生在读";
                break;
            case "2":
                degree = "博士在读";
                break;
            default:
                degree = "未注册";
                break;
        }
        request.setAttribute("degree", degree);

        // 选修课程信息
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

        // 主修、辅修院系信息
        DepartmentDAO departmentDAO = new DepartmentDAO(dbHandle);
        List<Department> major_departments = departmentDAO.queryByDepartmentNo(students.get(0).getMajor_department_no());
        if(major_departments.size() != 0)
        {
            request.setAttribute("major_department", major_departments.get(0));
        }
        List<Department> minor_departments = departmentDAO.queryByDepartmentNo(students.get(0).getMinor_department_no());
        if(minor_departments.size() != 0)
        {
            request.setAttribute("minor_department", minor_departments.get(0));
        }

        // 主修、辅修专业信息
        ProfessionDAO professionDAO = new ProfessionDAO(dbHandle);
        List<Profession> major_professions = professionDAO.queryByProfessionNo(students.get(0).getMajor_profession_no());
        if(major_professions.size() != 0)
        {
            request.setAttribute("major_profession", major_professions.get(0));
        }
        List<Profession> minor_professions = professionDAO.queryByProfessionNo(students.get(0).getMinor_profession_no());
        if(minor_professions.size() != 0)
        {
            request.setAttribute("minor_profession", minor_professions.get(0));
        }

        request.getRequestDispatcher("/student.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
