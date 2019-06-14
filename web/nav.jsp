<%--
  Created by IntelliJ IDEA.
  User: lyj
  Date: 2019/6/13
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">
        <img src="/img/niurou.png" width="30" height="30" class="d-inline-block align-top" alt="">
        煳腩大学
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/index">主页<span class="sr-only">(current)</span></a>
            </li>
            <% if (session.getAttribute("isLogged") != null){%>
            <li class="nav-item">
                <a class="nav-link" href="/student">个人中心</a>
            <li class="nav-item">
                <a class="nav-link" href="/choose_course">选课中心</a>
            <li class="nav-item">
                <a class="nav-link" href="/logout">退出</a>
                    <%}else{%>
            <li class="nav-item">
                <a class="nav-link" href="sign_in.jsp">登录</a>
                <%}%>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/close">关闭连接</a>
            </li>
        </ul>
    </div>
</nav>
</body>
</html>
