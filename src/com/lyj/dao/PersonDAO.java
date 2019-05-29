package com.lyj.dao;

import com.lyj.constant.Constants;
import com.lyj.entity.Person;

import java.util.List;

/**
 * Created by lyj on 2019/4/18.
 * 描述：Person表操作类
 */
public class PersonDAO {

    private DBHandle dbHandle;

    public PersonDAO(DBHandle dbHandle)
    {
        this.dbHandle = dbHandle;
    }

    /**
     * 创建表
     */
    public int create()
    {
        int count = 0;
        if(!dbHandle.isTableExist("user")) {
            count = dbHandle.executeUpdate(Constants.CREATE_TABLE_PERSON);
        }
        return count;
    }

    /**
     * 删除表
     */
    public int delete()
    {
        if(dbHandle.isTableExist("person"))
        {
            return dbHandle.executeUpdate(Constants.DELETE_TABLE_PERSON);
        }
        return 0;
    }

    /**
     * 插入数据
     */
    public int insert(Object...params)
    {
        Person person = new Person();
        person.setUsername(params.length > 0? (String)params[0]:null);
        person.setName(params.length > 1? (String)params[1]:null);
        person.setAge(params.length > 2? (Integer) params[2]:null);
        person.setTeleno(params.length > 3? (String)params[3]:null);

        // 如果User表不存在相同username值
        if(new UserDAO(dbHandle).queryByUserName(person.getUsername()).size() == 0)
        {
            dbHandle.executeUpdate(Constants.INSERT_TABLE_USERS, person.getUsername(), "888888");
        }

        // 判断Person表是否存在相同username值
        if(queryByUserName(person.getUsername()).size() != 0)
        {
            return updateByUserName(person.getName(), person.getAge(), person.getTeleno(), person.getUsername());
        }
        else
        {
            return dbHandle.executeUpdate(Constants.INSERT_TABLE_PERSON, person.getUsername(), person.getName(), person.getAge(), person.getTeleno());
        }
    }

    /**
     * 删除数据:根据like username
     */
    public int deleteByUserName(Object...params)
    {
        Person person = new Person();
        person.setUsername(params.length > 0? (String)params[0]:null);
        // 如果User表存在该username，则进行外键删除
        if(new UserDAO(dbHandle).queryByUserName(person.getUsername()).size() != 0)
        {
            return dbHandle.executeUpdate(Constants.DELETE_TABLE_USERS_BY_USERNAME, person.getUsername() + "%");
        }
        // 正常删除
        else
        {
            return dbHandle.executeUpdate(Constants.DELETE_TABLE_PERSON_BY_USERNAME, person.getUsername() + "%");
        }
    }

    /**
     * 更新数据：根据username值
     */
    public int updateByUserName(Object...params)
    {
        return dbHandle.executeUpdate(Constants.UPDATE_TABLE_PERSON_BY_USERNAME, params);
    }

    /**
     * 查询数据：根据username值
     */
    public List<Person> queryByUserName(Object...params)
    {
        return dbHandle.executeQuery(Constants.QUERY_TABLE_PERSON_USERNAME, Person.class, params);
    }

    /**
     * 查询全部数据
     */
    public List<Person> queryAll(Object...params)
    {
        return dbHandle.executeQuery(Constants.QUERY_TABLE_PERSON_ALL, Person.class, params);
    }
}
