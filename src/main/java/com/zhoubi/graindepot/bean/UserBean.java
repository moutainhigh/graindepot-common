package com.zhoubi.graindepot.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2018-12-5.
 */
public class UserBean implements Serializable {
    private Integer userid;

    private String username;

    private String password;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
