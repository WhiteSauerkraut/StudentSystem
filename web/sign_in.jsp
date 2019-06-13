<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="myStyle.css" charset="utf-8">
        <title>登录</title>
    </head>
    <body style="background:#f7f7f7">
    <jsp:include page="nav.jsp"/>
        <div class="teacher-container" style="margin: 100px auto;max-width: 600px;padding-bottom: 100px">
            <h1 align="center" style="margin:30px 0">登陆</h1>
            
            <form action="/log" method="post">
                <div class="form-group">
                    <label for="exampleInputEmail1">账号</label>
                    <input type="text" name="account" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="请输入账号">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">密码</label>
                    <input type="password" name="pass" class="form-control" id="exampleInputPassword1" placeholder="请输入密码">
                </div>
                <%--<div class="form-check">--%>
                    <%--<input class="form-check-input" type="radio" name="authority" id="exampleRadios1" value="option1" checked>--%>
                    <%--<label class="form-check-label" for="exampleRadios1">--%>
                        <%--学生--%>
                    <%--</label>--%>
                <%--</div>--%>
                    <%--<div class="form-check">--%>
                    <%--<input class="form-check-input" type="radio" name="authority" id="exampleRadios2" value="option2">--%>
                    <%--<label class="form-check-label" for="exampleRadios2">--%>
                        <%--老师--%>
                    <%--</label>--%>
                <%--</div>--%>

                <button type="submit" class="btn btn-primary" style="margin-top:50px;float: right">Submit</button>
            </form>
            <c:if test="${success == 'false'}">
                <p align="center" style="color:red">账号密码错误，请重新输入账号密码</p>
            </c:if>
        </div>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>