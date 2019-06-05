package com.lyj.entity;

/**
 * Created by lyj on 2019/5/30.
 * 描述：专业实体类
 */
public class Profession {
    private String profession_no;
    private String department_no;
    private String professions_name;
    private String learn_fields;
    private String degree;
    private Integer need_credit;

    public String getProfession_no() {
        return profession_no;
    }

    public void setProfession_no(String profession_no) {
        this.profession_no = profession_no;
    }

    public String getDepartment_no() {
        return department_no;
    }

    public void setDepartment_no(String department_no) {
        this.department_no = department_no;
    }

    public String getProfessions_name() {
        return professions_name;
    }

    public void setProfessions_name(String professions_name) {
        this.professions_name = professions_name;
    }

    public String getLearn_fields() {
        return learn_fields;
    }

    public void setLearn_fields(String learn_fields) {
        this.learn_fields = learn_fields;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Integer getNeed_credit() {
        return need_credit;
    }

    public void setNeed_credit(Integer need_credit) {
        this.need_credit = need_credit;
    }
}
