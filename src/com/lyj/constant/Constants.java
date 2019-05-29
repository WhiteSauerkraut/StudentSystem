package com.lyj.constant;

/**
 * Created by lyj on 2019/3/28.
 * 描述：常量类
 */
public class Constants {

    /**
     * 建表
     */
    public static final String CREATE_TABLE_USERS = "CREATE TABLE users("
            + "username varchar(10),"
            + "pass varchar(8),"
            + "primary key(username));";
    public static final String CREATE_TABLE_PERSON = "CREATE TABLE person("
            + "username varchar(10),"
            + "name varchar(20),"
            + "age int,"
            + "teleno char(11),"
            + "primary key(name),"
            + "FOREIGN KEY(username) REFERENCES users(username) ON DELETE CASCADE);";

    /**
     * 删表
     */
    public static final String DELETE_TABLE_USERS = "DROP TABLE users CASCADE;";
    public static final String DELETE_TABLE_PERSON = "DROP TABLE person CASCADE;";

    /**
     * 插入
     */
    public static final String INSERT_TABLE_USERS = "INSERT INTO users(username,pass) VALUE(?,?) " +
            "ON DUPLICATE KEY UPDATE PASS=VALUES(PASS);";
    public static final String INSERT_TABLE_PERSON = "INSERT INTO person(username,name,age,teleno) VALUE(?,?,?,?)" +
            "ON DUPLICATE KEY UPDATE username=VALUES(username),age=VALUES(age),teleno=VALUES(teleno);";

    /**
     * 查询
     */
    public static final String QUERY_TABLE_USERS_ALL = "SELECT * FROM users;";
    public static final String QUERY_TABLE_PERSON_ALL = "SELECT * FROM person;";
    public static final String QUERY_TABLE_USERS_USERNAME= "SELECT * FROM users WHERE USERNAME = ?;";
    public static final String QUERY_TABLE_PERSON_USERNAME= "SELECT * FROM person WHERE USERNAME = ?;";

    /**
     * 更新
     */
    public static final String UPDATE_TABLE_PERSON_BY_USERNAME = "UPDATE person SET name=?,age=?,teleno=? WHERE username = ?;";
    public static final String UPDATE_TABLE_USER_BY_USERNAME = "UPDATE user SET pass=? WHERE username = ?;";

    /**
     * 删除
     */
    public static final String DELETE_TABLE_USERS_BY_USERNAME = "DELETE FROM users WHERE username LIKE ?;";
    public static final String DELETE_TABLE_PERSON_BY_USERNAME = "DELETE FROM person WHERE username LIKE ?;";
}
