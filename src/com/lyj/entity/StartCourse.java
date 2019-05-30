package com.lyj.entity;

/**
 * Created by lyj on 2019/5/30.
 * 描述：开课实体类
 */
public class StartCourse {
    private String teacher_no;
    private String course_code;

    public String getTeacher_no() {
        return teacher_no;
    }

    public void setTeacher_no(String teacher_no) {
        this.teacher_no = teacher_no;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }
}
