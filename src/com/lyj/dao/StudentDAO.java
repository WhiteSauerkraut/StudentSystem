package com.lyj.dao;

import com.lyj.constant.SqlConstants;
import com.lyj.entity.Student;

import java.util.List;

/**
 * Created by lyj on 2019/6/5.
 * 描述：
 */
public class StudentDAO {

    private DBHandle dbHandle;

    public StudentDAO(DBHandle dbHandle)
    {
        this.dbHandle = dbHandle;
    }

    /**
     * 查询指定院系的学生信息
     */
    public List<Student> queryByDepartmentNo(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_STUDENT_BY_DEPARTMENT_NO, Student.class, params);
    }

    /**
     * 查询指定学号的学生信息
     */
    public List<Student> queryByStudentNo(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_STUDENT_BY_STUDENT_NO, Student.class, params);
    }

    /**
     * 查询全部学生信息
     */
    public List<Student> queryAll(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_STUDENT_ALL, Student.class, params);
    }
}
