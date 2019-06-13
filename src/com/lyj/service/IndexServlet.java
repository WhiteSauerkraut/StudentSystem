package com.lyj.service;

import com.lyj.dao.DBHandle;
import com.lyj.dao.DepartmentDAO;
import com.lyj.entity.Department;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by lyj on 2019/4/25.
 * 描述：
 */
@WebServlet(name = "IndexServlet")
public class IndexServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.isNew())
        {
            DBHandle dbHandle = new DBHandle();
            dbHandle.openConnection(this.getServletContext().getRealPath("/config.properties"));
            session.setAttribute("dbHandle", dbHandle);
            session.setAttribute("isLogged", null);
            System.out.println("--------------开启连接---------------");
        }
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");
        List<Department> departments= new DepartmentDAO(dbHandle).queryAll();
        request.setAttribute("departments", departments);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
