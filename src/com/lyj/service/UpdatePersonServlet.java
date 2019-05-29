package com.lyj.service;

import com.lyj.dao.DBHandle;
import com.lyj.dao.PersonDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

/**
 * Created by lyj on 2019/4/18.
 * 描述：更新Person数据库
 */
@WebServlet(name = "UpdatePersonServlet")
public class UpdatePersonServlet extends HttpServlet {
    /**
     * 处理Post请求
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String name = request.getParameter("name");
        Integer age = Objects.equals(request.getParameter("age"), "") ? null:Integer.parseInt(request.getParameter("age"));
        String teleno = request.getParameter("teleno");
        String type = "插入";
        String result = "成功";
        HttpSession session = request.getSession();
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");
        PersonDAO personDAO = new PersonDAO(dbHandle);
        if(personDAO.queryByUserName(username).size() != 0)
        {
            type = "更新";
        }
        personDAO.insert(username, name, age, teleno);
        request.setAttribute("tableName", "person");
        request.setAttribute("username", username);
        request.setAttribute("type", type);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

    /**
     * 处理Get请求
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
