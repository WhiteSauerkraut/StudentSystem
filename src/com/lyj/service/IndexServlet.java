package com.lyj.service;

import com.lyj.dao.DBHandle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

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
            System.out.println("--------------开启连接---------------");
        }
        request.getRequestDispatcher("/update.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
