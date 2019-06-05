package com.lyj.dao;

import com.lyj.constant.SqlConstants;
import com.lyj.entity.Teacher;

import java.util.List;

/**
 * Created by lyj on 2019/5/30.
 * 描述：
 */
public class TeacherDAO {

    private DBHandle dbHandle;

    public TeacherDAO(DBHandle dbHandle)
    {
        this.dbHandle = dbHandle;
    }

    /**
     * 查询指定院系的老师信息
     */
    public List<Teacher> queryByDepartmentNo(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_TEACHER_BY_DEPARTMENT_NO, Teacher.class, params);
    }

    /**
     * 查询指定教师号的老师信息
     */
    public List<Teacher> queryByTeacherNo(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_TEACHER_BY_STUDENT_NO, Teacher.class, params);
    }

    /**
     * 查询全部老师信息
     */
    public List<Teacher> queryAll(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_TEACHER_ALL, Teacher.class, params);
    }
}
