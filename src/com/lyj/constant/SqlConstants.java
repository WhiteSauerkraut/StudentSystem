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

    /**
     * teachers
     */
    public static final String QUERY_TABLE_TEACHER_ALL = "SELECT * FROM teachers;";
    public static final String QUERY_TABLE_TEACHER_BY_DEPARTMENT_NO = "SELECT * FROM teachers WHERE DEPARTMENT_NO = ?;;";
}
