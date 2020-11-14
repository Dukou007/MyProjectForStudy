package com.jettech.thread;

import com.jettech.entity.Person;

/**
 * @author : dukou_caiqin@163.com
 * @date: 2020/11/11  6:50
 * @description: 测试专用
 */
public class Test001 {
    public static void main(String[] args) {
        Person person = new Person("jay", 11, "check");
        System.out.println(person.getAge() + person.getUsername() + person.getMsg());
        if (person.getAge() < 10) {
            System.out.println(person.getAge());
            System.out.println("<<<<<<<<<,");
        } else {
            System.out.println(person.getAge());
            System.out.println(">>>>>>>>>>>>.");
        }
    }
}
