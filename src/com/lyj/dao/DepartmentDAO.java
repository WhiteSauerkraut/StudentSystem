package com.lyj.dao;

import com.lyj.constant.SqlConstants;
import com.lyj.entity.Department;

import java.util.List;

/**
 * Created by lyj on 2019/5/30.
 * 描述：
 */
public class DepartmentDAO {

    private DBHandle dbHandle;

    public DepartmentDAO(DBHandle dbHandle)
    {
        this.dbHandle = dbHandle;
    }

    /**
     * 查询全部信息
     */
    public List<Department> queryAll(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_DEPARTMENT_ALL, Department.class, params);
    }

    /**
     * 查询指定院号的院系信息
     */
    public List<Department> queryByDepartmentNo(Object...params)
    {
        return dbHandle.executeQuery(SqlConstants.QUERY_TABLE_DEPARTMENT_BY_DEPARTMENT_NO, Department.class, params);
    }
}
