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
 * 描述：关闭数据库连接
 */
@WebServlet(name = "CloseServlet")
public class CloseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");
        dbHandle.closeConnection();
        session.invalidate();
        System.out.println("--------------关闭连接--------------");
        request.getRequestDispatcher("/closePage.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
