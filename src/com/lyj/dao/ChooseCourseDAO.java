package com.lyj.dao;

import com.lyj.constant.SqlConstants;
import com.lyj.entity.ChooseCourse;

import java.util.List;

/**
 * Created by lyj on 2019/6/5.
 * 描述：
 */
public class ChooseCourseDAO {

    private DBHandle dbHandle;

    public ChooseCourseDAO(DBHandle dbHandle)
    {
        this.dbHandle = dbHandle;
    }

    /**
     * 查询指定学号的选修课程信息
     */
    public List<ChooseCourse> queryByStudentNo(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_CHOOSE_COURSE_BY_STUDENT_NO, ChooseCourse.class, params);
    }

    /**
     * 查询全部课程信息
     */
    public List<ChooseCourse> queryAll(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_CHOOSE_COURSE_ALL, ChooseCourse.class, params);
    }

    /**
     * 删除指定学号及课程号的选课记录
     */
    public int deleteByStudentNoAndCourseCode(Object...params)
    {
        return dbHandle.executeUpdate(SqlConstants.DELETE_TABLE_CHOOSE_COURSE_BY_STUDENT_NO_AND_COURSE_CODE, params);
    }

    /**
     * 插入指定学号及课程号的选课记录
     */
    public int insertByStudentNoAndCourseCode(Object...params)
    {
        return dbHandle.executeUpdate(SqlConstants.INSERT_TABLE_CHOOSE_COURSE_BY_STUDENT_NO_AND_COURSE_CODE, params);
    }
}
