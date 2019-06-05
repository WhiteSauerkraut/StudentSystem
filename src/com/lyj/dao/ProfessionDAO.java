package com.lyj.dao;

import com.lyj.constant.SqlConstants;
import com.lyj.entity.Profession;

import java.util.List;

/**
 * Created by lyj on 2019/6/5.
 * 描述：
 */
public class ProfessionDAO {

    private DBHandle dbHandle;

    public ProfessionDAO(DBHandle dbHandle)
    {
        this.dbHandle = dbHandle;
    }

    /**
     * 查询指定院系的专业信息
     */
    public List<Profession> queryByDepartmentNo(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_PROFESSION_BY_DEPARTMENT_NO, Profession.class, params);
    }

    /**
     * 查询全部专业信息
     */
    public List<Profession> queryAll(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_PROFESSION_ALL, Profession.class, params);
    }
}
