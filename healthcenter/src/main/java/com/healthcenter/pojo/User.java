package com.healthcenter.pojo;

import java.sql.Date;//e.g.2000-01-01
//import java.sql.Time;//e.g.22:59:59
import java.sql.Timestamp;//e.g.2000-01-01 00:00:01

//注意，数据类型与数据库的对应容易产生错误
public class User {
    private int id;//用户ID
    private String name;//用户昵称
    private String pwd;//密码


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}

