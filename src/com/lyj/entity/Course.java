package com.lyj.entity;

/**
 * Created by lyj on 2019/5/30.
 * 描述：课程实体类
 */
public class Course {
    private String course_code;
    private String department_no;
    private String course_no;
    private String course_name;
    private String course_kind;
    private Integer period;
    private Integer credit;
    private String degree;
    private String specification;
    private String course_addr;
    private String course_term;
    private String course_year;

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getDepartment_no() {
        return department_no;
    }

    public void setDepartment_no(String department_no) {
        this.department_no = department_no;
    }

    public String getCourse_no() {
        return course_no;
    }

    public void setCourse_no(String course_no) {
        this.course_no = course_no;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_kind() {
        return course_kind;
    }

    public void setCourse_kind(String course_kind) {
        this.course_kind = course_kind;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getCourse_addr() {
        return course_addr;
    }

    public void setCourse_addr(String course_addr) {
        this.course_addr = course_addr;
    }

    public String getCourse_term() {
        return course_term;
    }

    public void setCourse_term(String course_term) {
        this.course_term = course_term;
    }

    public String getCourse_year() {
        return course_year;
    }

    public void setCourse_year(String course_year) {
        this.course_year = course_year;
    }
}
