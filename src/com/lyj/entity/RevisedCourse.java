package com.lyj.entity;

/**
 * Created by lyj on 2019/6/13.
 * 描述：学生已修课程
 */
public class RevisedCourse {
    private String course_code;
    private String course_name;
    private Integer credit;
    private Integer period;
    private String class_time;
    private String course_addr;
    private String teacher_name;

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getClass_time() {
        return class_time;
    }

    public void setClass_time(String class_time) {
        this.class_time = class_time;
    }

    public String getCourse_addr() {
        return course_addr;
    }

    public void setCourse_addr(String course_addr) {
        this.course_addr = course_addr;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }
}
