package com.lyj.dao;

import com.lyj.constant.Constants;
import com.lyj.entity.User;

import java.util.List;

/**
 * Created by lyj on 2019/4/18.
 * 描述：User表操作类
 */
public class UserDAO {

    private DBHandle dbHandle;

    public UserDAO(DBHandle dbHandle) {
        this.dbHandle = dbHandle;
    }

    /**
     * 创建表
     */
    public int create()
    {
        if(!dbHandle.isTableExist("user")) {
            return dbHandle.executeUpdate(Constants.CREATE_TABLE_USERS);
        }
        return 0;
    }

    /**
     * 删除表
     */
    public int delete()
    {
        if(dbHandle.isTableExist("user"))
        {
            return dbHandle.executeUpdate(Constants.DELETE_TABLE_USERS);
        }
        return 0;
    }

    /**
     * 插入数据
     */
    public int insert(Object...params)
    {
        User user = new User();
        user.setUsername(params.length > 0? (String)params[0]:null);
        user.setPass(params.length > 1? (String)params[1]:null);
        return dbHandle.executeUpdate(Constants.INSERT_TABLE_USERS, user.getUsername(), user.getPass());
    }

    /**
     * 删除数据：根据like username删除
     */
    public int deleteByUserName(Object...params)
    {
        User user = new User();
        user.setUsername(params.length > 0? (String)params[0]:null);
        return dbHandle.executeUpdate(Constants.DELETE_TABLE_USERS_BY_USERNAME, user.getUsername() + "%");
    }

    /**
     * 更新数据：根据username值
     */
    public int updateByUserName(Object...params)
    {
        return dbHandle.executeUpdate(Constants.UPDATE_TABLE_USER_BY_USERNAME, params);
    }

    /**
     * 查询全部数据
     */
    public List<User> queryAll(Object...params)
    {
        return dbHandle.executeQuery(Constants.QUERY_TABLE_USERS_ALL, User.class, params);
    }

    /**
     * 查询数据：根据username值查询
     */
    public List<User> queryByUserName(Object...params)
    {
        return dbHandle.executeQuery(Constants.QUERY_TABLE_USERS_USERNAME, User.class, params);
    }
}
