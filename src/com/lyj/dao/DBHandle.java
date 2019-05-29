package com.lyj.dao;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by lyj on 2019/3/28.
 * 描述：数据库操作类
 */
public class DBHandle {

    private  Connection conn = null;

    private  PreparedStatement pstm = null;

    private  ResultSet rs = null;

    /**
     * 打开数据库连接
     */
    public void openConnection(String configFilePath){
        try {
            Properties ps = new Properties();
            ps.load(new FileInputStream(configFilePath));
            String driver = ps.getProperty("DRIVER");
            String ip = ps.getProperty("IP");
            String port = ps.getProperty("PORT");
            String dbName = ps.getProperty("DBNAME");
            String username = ps.getProperty("USERNAME");
            String password = ps.getProperty("PASSWORD");
            String url = "jdbc:mysql://" + ip + ":" + port + "/" + dbName
                    + "?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 关闭数据库连接
     */
    public void closeConnection(){
        try{
            if(rs!=null) {
                rs.close();
            }
            if(pstm != null) {
                pstm.close();
            }
            if(conn != null) {
                conn.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 根据表名判断数据库是否已存在该表
     */
    public boolean isTableExist(String tableName){
        boolean flag = false;
        try {
            rs = conn.getMetaData().getTables(null, null, tableName, new String[] { "TABLE" });
            flag = rs.next();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 执行所有的单表查询(利用反射适配多表)
     * @param sql 查询语句
     * @param clz 表类型
     * @param params 传入参数
     * @return List<T> 返回查询对象列表
     */
    public <T> List<T> executeQuery(String sql, Class<T> clz, Object...params){
        rs = null;
        pstm = null;
        List<T> data = new ArrayList<>();

        try {
            pstm = conn.prepareStatement(sql);
            if(params != null && params.length > 0)
            {
                for(int i = 0 ; i < params.length ; i++)
                {
                    pstm.setObject(i+1, params[i]);
                }
            }
            rs = pstm.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();
            List<String> columns = new ArrayList<>(columnCount);
            for(int i = 0 ; i < columnCount ; i++)
            {
                String columnName = rsmd.getColumnLabel(i + 1);
                columns.add(columnName);
            }

            // 遍历结果集
            while(rs.next())
            {
                T t = clz.newInstance();
                for(String columnName : columns)
                {
                    Field[] fields = clz.getDeclaredFields();
                    for(Field field : fields )
                    {
                        if(field.getName().equalsIgnoreCase(columnName))
                        {
                            Object value;
                            value = rs.getObject(columnName);
                            field.setAccessible(true);
                            field.set(t, value);
                            break;
                        }
                    }
                }
                data.add(t);
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 执行所有的insert、delete、update语句
     * @param sql 查询语句
     * @param params 传入参数
     * @return int 影响数据库的行数
     */
    public  int executeUpdate(String sql, Object...params) {
        pstm = null;
        try {
            pstm = conn.prepareStatement(sql);
            if(params != null && params.length > 0) {
                for(int i = 0 ; i < params.length ; i++) {
                    pstm.setObject(i + 1, params[i]);
                }
            }
            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
