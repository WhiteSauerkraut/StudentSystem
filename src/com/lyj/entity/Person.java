package com.lyj.entity;

/**
 * Created by lyj on 2019/3/28.
 * 描述：个人信息类
 */
public class Person {

    private String username;
    private String name;
    private Integer age;
    private String teleno;

    public Person(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTeleno() {
        return teleno;
    }

    public void setTeleno(String teleno) {
        this.teleno = teleno;
    }

    @Override
    public String toString() {
        int count = 0;
        char[] cs = name.toCharArray();
        for (char c : cs) {
            String len = Integer.toBinaryString(c);
            if (len.length() > 8)
                count++;
        }
        int len = name == null? 20:20 - count;
        String outputAge = String.valueOf(age==null?"":age);
        String outputTeleno = String.valueOf(teleno==null?"":teleno);
        return String.format("%-10s" , username) + "    " + String.format("%-" + len + "s", name) + "    "
                + String.format("%-4s" , outputAge) + "    " + String.format("%-11s", outputTeleno);

    }
}
