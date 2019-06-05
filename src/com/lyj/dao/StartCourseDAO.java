package com.lyj.dao;

import com.lyj.constant.SqlConstants;
import com.lyj.entity.StartCourse;

import java.util.List;

/**
 * Created by lyj on 2019/6/5.
 * 描述：
 */
public class StartCourseDAO {

    private DBHandle dbHandle;

    public StartCourseDAO(DBHandle dbHandle)
    {
        this.dbHandle = dbHandle;
    }

    /**
     * 查询指定老师的开设课程信息
     */
    public List<StartCourse> queryByTeacherNo(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_START_COURSE_BY_TEACHER_NO, StartCourse.class, params);
    }
}
