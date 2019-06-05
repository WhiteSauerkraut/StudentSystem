package com.lyj.dao;

import com.lyj.constant.SqlConstants;
import com.lyj.entity.Course;

import java.util.List;

/**
 * Created by lyj on 2019/6/5.
 * 描述：
 */
public class CourseDAO {

    private DBHandle dbHandle;

    public CourseDAO(DBHandle dbHandle)
    {
        this.dbHandle = dbHandle;
    }

    /**
     * 查询指定院系的课程信息
     */
    public List<Course> queryByDepartmentNo(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_COURSE_BY_DEPARTMENT_NO, Course.class, params);
    }

    /**
     * 查询指定开课号的课程信息
     */
    public List<Course> queryByCourseCode(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_COURSE_BY_COURSE_CODE, Course.class, params);
    }

    /**
     * 查询全部课程信息
     */
    public List<Course> queryAll(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_COURSE_ALL, Course.class, params);
    }
}
