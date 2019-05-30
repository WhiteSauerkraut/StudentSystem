package com.lyj.entity;

/**
 * Created by lyj on 2019/5/30.
 * 描述：教师实体类
 */
public class Teacher {
    private String teacher_no;
    private String account;
    private String department_no;
    private String teacher_name;
    private String teacher_dec;
    private String research_fields;
    private String addr;
    private String tel;
    private String email;

    public String getTeacher_no() {
        return teacher_no;
    }

    public void setTeacher_no(String teacher_no) {
        this.teacher_no = teacher_no;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDepartment_no() {
        return department_no;
    }

    public void setDepartment_no(String department_no) {
        this.department_no = department_no;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_dec() {
        return teacher_dec;
    }

    public void setTeacher_dec(String teacher_dec) {
        this.teacher_dec = teacher_dec;
    }

    public String getResearch_fields() {
        return research_fields;
    }

    public void setResearch_fields(String research_fields) {
        this.research_fields = research_fields;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
