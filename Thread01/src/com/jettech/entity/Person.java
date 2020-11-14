package com.jettech.entity;

/**
 * @author : dukou_caiqin@163.com
 * @date: 2020/11/11  6:48
 * @description: 人类,测试专用
 */
public class Person {
    private String username;
    private Integer age;
    private String msg;

    public Person(String username, Integer age, String msg) {
        this.username = username;
        this.age = age;
        this.msg = msg;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", msg='" + msg + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
