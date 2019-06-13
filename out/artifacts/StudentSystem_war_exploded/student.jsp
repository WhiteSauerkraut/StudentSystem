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
        <title>个人中心</title>
    </head>
    <body style="background:#f7f7f7">
    <jsp:include page="nav.jsp"/>
        <div class="teacher-container">
            <div class="teacher-information" style="display:flex">
                <%--<img src="./img/bz.png" alt="" width="200" height="200" style="margin: 20px 20px">--%>
                <div class="teacher-introduction" style="margin: 20px 20px">
                    <h1>${student.stu_name}</h1>
                    <br>
                    <p><b>性别:</b> ${student.stu_name} <b>出生日期：</b>${student.birth_date}</p>
                    <p><b>证件号：</b>${student.identification} <b>联系电话：</b>${student.tel}</p>
                    <p><b>家庭地址：</b>${student.family_addr}</p>
                    <p><b>宿舍地址：</b>${student.dormitory_addr}</p>
                    <p><b>学号：</b>${student.stu_no} <b>年级：</b>${student.grade}</p>
                    <p><b>主修专业：</b>${major_profession.professions_name} <b>主修学院：</b> ${major_department.department_name}</p>
                    <p><b>辅修专业：</b>${minor_profession.professions_name} <b>辅修学院：</b>${minor_department.department_name}</p>
                    <p><b>已修学分：</b>${student.credit} <b>学位等级：</b>${degree}</p>
                </div>
            </div>
        </div>
        <div class="chartbox">
            <ul class="chartmenu">
                <li>课程号</li>
                <li>课程名</li>
                <li>课程状态</li>
                <li>平时成绩</li>
                <li>期中成绩</li>
                <li>期末成绩</li>
                <li>总成绩</li>
                <li>学分</li>
            </ul>
            <div class="courses">
                <c:forEach var="chooseCourse" items="${chooseCourses}" varStatus="s">
                    <ul class="course-item">
                        <li>${chooseCourse.course_code}</li>
                        <li>${courses[s.count-1].course_name}</li>
                        <li>${chooseCourse.course_state}</li>
                        <li>${chooseCourse.regular_grade}</li>
                        <li>${chooseCourse.midterm_grade}</li>
                        <li>${chooseCourse.final_grade}</li>
                        <li>${chooseCourse.total_mark}</li>
                        <li>${courses[s.count-1].credit}</li>
                    </ul>
                </c:forEach>
            </div>
        </div>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>