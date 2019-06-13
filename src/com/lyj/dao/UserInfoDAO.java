package com.lyj.dao;

import com.lyj.constant.SqlConstants;
import com.lyj.entity.UserInfo;

import java.util.List;

/**
 * Created by lyj on 2019/6/11.
 * 描述：
 */
public class UserInfoDAO {

    private DBHandle dbHandle;

    public UserInfoDAO(DBHandle dbHandle)
    {
        this.dbHandle = dbHandle;
    }

    /**
     * 查询指定老师的账户信息
     */
    public List<UserInfo> queryByTeacher_Account_Pass(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_USER_INFOS_BY_TEACHER_ACCOUNT_PASS, UserInfo.class, params);
    }

    /**
     * 查询指定学生的账户信息
     */
    public List<UserInfo> queryByStudent_Account_Pass(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_USER_INFOS_BY_STUDENT_ACCOUNT_PASS, UserInfo.class, params);
    }
}
