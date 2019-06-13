<%--
  Created by IntelliJ IDEA.
  User: lyj
  Date: 2019/5/28
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
  <link rel="stylesheet" href="myStyle.css" charset="utf-8"/>
  <title>欢迎来到煳腩大学</title>
</head>
<body>
<jsp:include page="nav.jsp"/>
<div class="introduction">
  <h1>
    煳腩大学欢迎您！
  </h1>
  <p>关于我们</p>
  <p>一句话简介</p>
  <p class="address">地址地址地址</p>
</div>
<div class="flex-box">
<c:forEach var="departments" items="${departments}">
  <div class="card" style="width: 18rem;">
    <img class="card-img-top" src="img/bz.png" alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">${departments.department_name}</h5>
      <p class="card-text">${departments.department_dec}</p>
      <a href="${pageContext.request.contextPath}/department?department_no=${departments.department_no}" class="btn btn-primary">进入学院</a>
    </div>
  </div>
</c:forEach>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
