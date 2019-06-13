package com.lyj.service;

import com.lyj.dao.DBHandle;
import com.lyj.dao.UserInfoDAO;
import com.lyj.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by lyj on 2019/6/11.
 * 描述：
 */
@WebServlet(name = "LogServlet")
public class LogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");

        String account = request.getParameter("account");
        String pass = request.getParameter("pass");
        List<UserInfo> userInfos = new UserInfoDAO(dbHandle).queryByStudent_Account_Pass(account, pass);
        if(userInfos.size() != 0)
        {
            request.setAttribute("userInfo", userInfos.get(0));
            session.setAttribute("isLogged", userInfos.get(0).getAccount());
            request.setAttribute("success", "true");
            response.sendRedirect("/index");
        }
        else
        {
            request.setAttribute("success", "false");
            request.getRequestDispatcher("/sign_in.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
