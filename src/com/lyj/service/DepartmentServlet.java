package com.lyj.service;

import com.lyj.dao.DBHandle;
import com.lyj.dao.TeacherDAO;
import com.lyj.entity.Teacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by lyj on 2019/5/30.
 * 描述：
 */
@WebServlet(name = "DepartmentServlet")
public class DepartmentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");
        List<Teacher> teachers = new TeacherDAO(dbHandle).queryByDepartmentNo(request.getParameter("department_no"));
        request.setAttribute("teachers", teachers);
        request.getRequestDispatcher("/department.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
