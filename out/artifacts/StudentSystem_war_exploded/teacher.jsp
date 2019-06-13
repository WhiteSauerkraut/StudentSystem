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
        <title>欢迎来到煳腩大学${department_name}</title>
    </head>
    <body style="background:#f7f7f7">
    <jsp:include page="nav.jsp"/>
        <div class="teacher-container">
            <div class="teacher-information" style="display:flex">
                <img src="/img/bz.png" alt="" width="200" height="200" style="margin: 20px 20px">
                <div class="teacher-introduction" style="margin: 20px 20px">
                    <h1>${teacher.teacher_name}</h1>
                    <br>
                    <p>${teacher.teacher_dec}</p>
                </div>
            </div>

            <div class="crouses">
                <h2 style="margin-left:20px">开课</h2>
                <div id="accordion">

                    <c:forEach var="course" items="${courses}">
                        <div class="card">
                          <div class="card-header" id="headingOne">
                            <h5 class="mb-0">
                              <button class="btn btn-link collapsed" data-toggle="collapse" data-target=#${course.course_no} aria-expanded="false" aria-controls=${course.course_no}>
                                ${course.course_name}
                              </button>
                            </h5>
                          </div>

                          <div id=${course.course_no} class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
                            <div class="card-body">
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item"><b>课程号：</b>${course.course_no}</li>
                                    <li class="list-group-item"><b>开课号：</b>${course.course_code}</li>
                                    <li class="list-group-item"><b>上课时间：</b>${course.course_year}${course.course_term}</li>
                                    <li class="list-group-item"><b>上课地点：</b>${course.course_addr}</li>
                                    <li class="list-group-item"><h5>课程说明：</h5>
                                            ${course.specification}
                                    </li>
                                </ul>
                            </div>
                          </div>
                        </div>
                    </c:forEach>

                </div>
            </div>
        </div>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>