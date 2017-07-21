package com.heitian.ssm.model;

import java.util.Date;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public class User {

    private int id;
    private String userName;
    private String userPwd;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
