package com.lyj.service;

import com.lyj.dao.DBHandle;
import com.lyj.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by lyj on 2019/4/20.
 * 描述：删除User数据
 */
@WebServlet(name = "DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String type = "删除";
        String result = "失败";
        HttpSession session = request.getSession();
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");
        UserDAO userDAO = new UserDAO(dbHandle);
        if(userDAO.queryByUserName(username).size() != 0)
        {
            result = "成功";
            userDAO.deleteByUserName(username);
        }
        request.setAttribute("tableName", "user");
        request.setAttribute("username", username);
        request.setAttribute("type", type);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
