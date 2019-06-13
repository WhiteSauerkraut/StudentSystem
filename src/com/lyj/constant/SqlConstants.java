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
    public static final String QUERY_TABLE_PROFESSION_BY_PROFESSION_NO = "SELECT * FROM professions WHERE profession_no = ?;";

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
    public static final String QUERY_TABLE_CHOOSE_COURSE_BY_STUDENT_NO = "SELECT * FROM choose_courses WHERE stu_no = ? and course_state = '通过';";
    public static final String DELETE_TABLE_CHOOSE_COURSE_BY_STUDENT_NO_AND_COURSE_CODE = "DELETE FROM choose_courses WHERE stu_no = ? and course_code = ?;";
    public static final String INSERT_TABLE_CHOOSE_COURSE_BY_STUDENT_NO_AND_COURSE_CODE = "INSERT INTO choose_courses(stu_no,course_code,course_state) VALUES (?,?,?);";

    /**
     * start_course
     */
    public static final String QUERY_TABLE_START_COURSE_BY_TEACHER_NO = "SELECT * FROM start_course WHERE teacher_no = ?;";

    /**
     * user_infos
     */
    public static final String QUERY_TABLE_USER_INFOS_BY_ACCOUNT_PASS = "SELECT * FROM user_infos WHERE account = ? and pass = ?;";
    public static final String QUERY_TABLE_USER_INFOS_BY_TEACHER_ACCOUNT_PASS = "SELECT * FROM user_infos WHERE teacher_no = ? and pass = ?;";
    public static final String QUERY_TABLE_USER_INFOS_BY_STUDENT_ACCOUNT_PASS = "SELECT * FROM user_infos WHERE stu_no = ? and pass = ?;";

    /**
     * 学生选课
     */
    public static final String QUERY_TABLES_BY_STUDENT_NO = "SELECT distinct courses.course_code as course_code," +
            "course_name,credit,period,class_time,course_addr,teacher_name " +
            "FROM choose_courses,courses,start_course,teachers " +
            "WHERE choose_courses.stu_no = ? and choose_courses.course_code = courses.course_code " +
            "and courses.course_code = start_course.course_code and start_course.teacher_no = teachers.teacher_no;";

    public static final String QUERY_TABLES_BY_NOT_CHOOSE_COURSE = "SELECT distinct "
            + "courses.course_code as course_code,course_name,credit,period,class_time,course_addr,teacher_name "
            + "FROM courses,start_course,teachers,choose_courses "
            + "WHERE courses.department_no = ? and courses.degree = ? "
            + "and courses.course_code not in (SELECT course_code FROM choose_courses WHERE stu_no = ?) "
            + "and courses.course_code = start_course.course_code and start_course.teacher_no = teachers.teacher_no;";

}
