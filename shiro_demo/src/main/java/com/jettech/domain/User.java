package com.jettech.domain;

import java.io.Serializable;

/**
 * @author : dukou_caiqin@163.com
 * @date: 2020/11/9  1:07
 * @description:
 */
public class User implements Serializable {
    private String username;
    private String password;
    private String salt;
    private Integer id;

    public User() {
    }

    public User(String username, String password, String salt, Integer id) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.id = id;
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
