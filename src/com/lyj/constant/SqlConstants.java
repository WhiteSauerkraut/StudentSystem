package com.lyj.constant;

/**
 * Created by lyj on 2019/5/30.
 * 描述：SQL语句常量类
 */
public class SqlConstants {

    /**
     * departments
     */
    public static final String QUERY_TABLE_DEPARTMENT_ALL = "SELECT * FROM departments;";
    public static final String QUERY_TABLE_DEPARTMENT_BY_DEPARTMENT_NO = "SELECT * FROM departments WHERE DEPARTMENT_NO = ?;";

    /**
     * teachers
     */
    public static final String QUERY_TABLE_TEACHER_ALL = "SELECT * FROM teachers;";
    public static final String QUERY_TABLE_TEACHER_BY_DEPARTMENT_NO = "SELECT * FROM teachers WHERE DEPARTMENT_NO = ?;";
    public static final String QUERY_TABLE_TEACHER_BY_STUDENT_NO = "SELECT * FROM teachers WHERE teacher_no = ?;";

    /**
     * professions
     */
    public static final String QUERY_TABLE_PROFESSION_ALL = "SELECT * FROM professions;";
    public static final String QUERY_TABLE_PROFESSION_BY_DEPARTMENT_NO = "SELECT * FROM professions WHERE DEPARTMENT_NO = ?;";

    /**
     * courses
     */
    public static final String QUERY_TABLE_COURSE_ALL = "SELECT * FROM courses;";
    public static final String QUERY_TABLE_COURSE_BY_DEPARTMENT_NO = "SELECT * FROM courses WHERE DEPARTMENT_NO = ?;";
    public static final String QUERY_TABLE_COURSE_BY_COURSE_CODE = "SELECT * FROM courses WHERE course_code = ?;";

    /**
     * students
     */
    public static final String QUERY_TABLE_STUDENT_ALL = "SELECT * FROM students;";
    public static final String QUERY_TABLE_STUDENT_BY_DEPARTMENT_NO = "SELECT * FROM students WHERE major_department_no = ?;";
    public static final String QUERY_TABLE_STUDENT_BY_STUDENT_NO = "SELECT * FROM students WHERE stu_no = ?;";

    /**
     * choose_courses
     */
    public static final String QUERY_TABLE_CHOOSE_COURSE_ALL = "SELECT * FROM choose_courses;";
    public static final String QUERY_TABLE_CHOOSE_COURSE_BY_STUDENT_NO = "SELECT * FROM choose_courses WHERE stu_no = ?;";

    /**
     * start_course
     */
    public static final String QUERY_TABLE_START_COURSE_BY_TEACHER_NO = "SELECT * FROM start_course WHERE teacher_no = ?;";

}
