package com.lyj.service;

import com.lyj.dao.DBHandle;
import com.lyj.dao.PersonDAO;
import com.lyj.dao.UserDAO;
import com.lyj.entity.Person;
import com.lyj.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by lyj on 2019/4/19.
 * 描述：显示查询界面
 */
@WebServlet(name = "ShowServlet")
public class ShowServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        DBHandle dbHandle = (DBHandle)session.getAttribute("dbHandle");
        List<User> users = new UserDAO(dbHandle).queryAll();
        List<Person> persons = new PersonDAO(dbHandle).queryAll();
        request.setAttribute("users", users);
        request.setAttribute("persons", persons);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
