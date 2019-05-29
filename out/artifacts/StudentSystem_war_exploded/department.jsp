<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	  <link rel="stylesheet" href="/myStyle.css">
    <title>欢迎来到煳腩大学</title>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">
            <img src="/img/niurou.png" width="30" height="30" class="d-inline-block align-top" alt="">
            煳腩大学XXX学院
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#">主页<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#" id = "teachers-button">教师<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#" id = "professions-button">专业<span class="sr-only">(current)</span></a>
            </li>
          </ul>
        </div>


    </nav>
    <div class="introduction">
      <h1>
        煳腩大学xxxxx学院欢迎您！
      </h1>
      <p>关于我们</p>
      <p>一句话简介</p>
      <p class="address">地址地址地址</p>
    </div>
    <div class="flex-box" id ="teachers">
        <div class="card" style="width: 18rem;">
            <img class="card-img-top" src="/img/bz.png" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">白萌萌</h5>
              <p class="card-text">一个负责教授卖萌的老师！</p>
            </div>
            <ul class="list-group list-group-flush">
              <li class="list-group-item">研究方向：卖萌</li>
              <li class="list-group-item">邮箱：baimengmeng@hnu.edu.cn</li>
              <li class="list-group-item">地址: 信息科学与工程学院555室</li>
            </ul>
            <div class="card-body">
              <a href="#" class="card-link">了解更多</a>
            </div>
          </div>
          <div class="card" style="width: 18rem;">
            <img class="card-img-top" src="/img/bz.png" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">梨花花</h5>
              <p class="card-text">一个负责教授卖萌的老师！</p>
            </div>
            <ul class="list-group list-group-flush">
              <li class="list-group-item">研究方向：卖萌</li>
              <li class="list-group-item">邮箱：lihuahua@hnu.edu.cn</li>
              <li class="list-group-item">地址: 信息科学与工程学院556室</li>
            </ul>
            <div class="card-body">
              <a href="#" class="card-link">了解更多</a>
            </div>
          </div>
    </div>
    <div id = "professions">
        <div class="card">
            <h5 class="card-header">计算机科学与技术</h5>
            <div class="card-body">
              <h5 class="card-title">学习方向</h5>
              <p class="card-text">计算机基础研究与相关应用</p>
              <a href="#" class="btn btn-primary">专业页面</a>
            </div>
          </div>
          <div class="card">
            <h5 class="card-header">计算机科学与技术</h5>
            <div class="card-body">
              <h5 class="card-title">学习方向</h5>
              <p class="card-text">计算机基础研究与相关应用</p>
              <a href="#" class="btn btn-primary">专业页面</a>
            </div>
          </div>
    </div>
    
	


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script>
        $("#professions").hide();
        $("#teachers-button").click(function(){
            console.log("teacher");

            $("#teachers").show();
            $("#teachers-button").parent().addClass("nav-item active");

            $("#professions").hide();
            $("#professions-button").parent().removeClass("nav-item active");

        })

        $("#professions-button").click(function(){
            console.log("profession");
            $("#teachers").hide();
            $("#teachers-button").parent().removeClass("nav-item active");

            $("#professions").show();
            $("#professions-button").parent().addClass("nav-item active");
        })
    </script>
  </body>
</html>