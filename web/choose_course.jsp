<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
        <link rel="stylesheet" type="text/css" href="myStyle.css?v=<%= System.currentTimeMillis()%>" charset="utf-8"/>
        <title>选课中心</title>
    </head>
    <body style="background:#f7f7f7">
    <jsp:include page="nav.jsp"/>
        <div class="teacher-container" id="yourCourse"> 
            <h3>您已选择的课</h3>
            <div class="courses_type" style="margin-left:30px">
                <li><b>课程号</b></li>
                <li><b>课程名</b></li>
                <li><b>学分</b></li>
                <li><b>学时</b></li>
                <li><b>上课时间</b></li>
                <li><b>上课地址</b></li>
                <li><b>上课教师</b></li>
            </div>
            <form action="revised_course_result">
                <c:forEach var="revisedCourse" items="${revisedCourses}">
                <div class="custom-control custom-checkbox">
                    <input type="checkbox" class="custom-control-input" name="revised_course" value=${revisedCourse.course_code} id=${revisedCourse.course_code}>
                    <label class="custom-control-label" for=${revisedCourse.course_code}>
                        <div class="courses_type">
                            <li>${revisedCourse.course_code}</li>
                            <li>${revisedCourse.course_name}</li>
                            <li>${revisedCourse.credit}</li>
                            <li>${revisedCourse.period}</li>
                            <li>${revisedCourse.class_time}</li>
                            <li>${revisedCourse.course_addr}</li>
                            <li>${revisedCourse.teacher_name}</li>
                        </div>
                    </label>
                </div>
                </c:forEach>
            <div style="margin:20px 0">
                <input class="btn btn-primary" type="submit" value="退课">
            </div>
            </form>
        </div>
        <div class="teacher-container" id="couldChoice">
            <h3>选课</h3>
            <div class="courses_type" style="margin-left:30px">
                <li><b>课程号</b></li>
                <li><b>课程名</b></li>
                <li><b>学分</b></li>
                <li><b>学时</b></li>
                <li><b>上课时间</b></li>
                <li><b>上课地址</b></li>
                <li><b>上课教师</b></li>
            </div>
            <form action="choose_course_result">
                <c:forEach var="course" items="${courses}">
                <div class="custom-control custom-checkbox">
                    <input type="checkbox" name="choose_course" value=${course.course_code} class="custom-control-input" id=${course.course_code}>
                        <label class="custom-control-label" for=${course.course_code}>
                            <div class="courses_type">
                                <li>${course.course_code}</li>
                                <li>${course.course_name}</li>
                                <li>${course.credit}</li>
                                <li>${course.period}</li>
                                <li>${course.class_time}</li>
                                <li>${course.course_addr}</li>
                                <li>${course.teacher_name}</li>
                            </div>
                        </label>
                </div>
                </c:forEach>
                <div style="margin:20px 0">
                    <input class="btn btn-primary" type="submit" value="选课">
                </div>
            </form>
        </div>
    
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>