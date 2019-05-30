package com.lyj.entity;

/**
 * Created by lyj on 2019/5/30.
 * 描述：选课实体类
 */
public class ChooseCourse {
    private String stu_no;
    private String course_code;
    private float regular_grade;
    private float midterm_grade;
    private float final_grade;
    private float total_mark;
    private String course_state;
    private float retest_score;
    private float restudy_score;

    public String getStu_no() {
        return stu_no;
    }

    public void setStu_no(String stu_no) {
        this.stu_no = stu_no;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public float getRegular_grade() {
        return regular_grade;
    }

    public void setRegular_grade(float regular_grade) {
        this.regular_grade = regular_grade;
    }

    public float getMidterm_grade() {
        return midterm_grade;
    }

    public void setMidterm_grade(float midterm_grade) {
        this.midterm_grade = midterm_grade;
    }

    public float getFinal_grade() {
        return final_grade;
    }

    public void setFinal_grade(float final_grade) {
        this.final_grade = final_grade;
    }

    public float getTotal_mark() {
        return total_mark;
    }

    public void setTotal_mark(float total_mark) {
        this.total_mark = total_mark;
    }

    public String getCourse_state() {
        return course_state;
    }

    public void setCourse_state(String course_state) {
        this.course_state = course_state;
    }

    public float getRetest_score() {
        return retest_score;
    }

    public void setRetest_score(float retest_score) {
        this.retest_score = retest_score;
    }

    public float getRestudy_score() {
        return restudy_score;
    }

    public void setRestudy_score(float restudy_score) {
        this.restudy_score = restudy_score;
    }
}
