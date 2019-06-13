package com.lyj.dao;

import com.lyj.constant.SqlConstants;
import com.lyj.entity.RevisedCourse;

import java.util.List;

/**
 * Created by lyj on 2019/6/13.
 * 描述：
 */
public class RevisedCourseDAO {
    private DBHandle dbHandle;

    public RevisedCourseDAO(DBHandle dbHandle)
    {
        this.dbHandle = dbHandle;
    }

    /**
     * 查询学生已选修课程信息（多表查询）
     */
    public List<RevisedCourse> queryByStudentNo(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLES_BY_STUDENT_NO, RevisedCourse.class, params);
    }

    /**
     * 查询学生未选修课程信息（多表查询）
     */
    public List<RevisedCourse> queryByNotChooseCourse(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLES_BY_NOT_CHOOSE_COURSE, RevisedCourse.class, params);
    }
}
