package com.lyj.entity;

/**
 * Created by lyj on 2019/3/28.
 * 描述：用户类
 */
public class User {

    private String username;

    private String pass;

    public User() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return String.format("%-10s" , username) + "    " + String.format("%-8s" , pass);
    }
}
