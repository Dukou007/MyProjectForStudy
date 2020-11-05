package com.jettech.realm;

import jdk.nashorn.internal.parser.Token;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;

/**
 * @author dukou_caiqin@163.com
 * @description 自定义realm
 * @date 2020/11/5
 * @date * @param null
 * @return
 */


public class SelfDefinedRealm extends SimpleAccountRealm {

    public static void main(String[] args) {
        // sihro 三个主要成分 subject security manager, realms
        // 创建安全管理器
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        // 读取realm文件
        securityManager.setRealm(new IniRealm("classpath:shiro.ini"));
        // 在工具类中设置securitymanager
        SecurityUtils.setSecurityManager(securityManager);
        // 获取subject
        Subject subject = SecurityUtils.getSubject();
        // 获取 token
        UsernamePasswordToken token = new UsernamePasswordToken("zhouxiaolong", "1234");
        // 登录
        try {
            subject.login(token);
            System.out.println("----------------------------------");
        } catch (IncorrectCredentialsException e) {
            e.printStackTrace();
            System.out.println(">>>>>>>>>>>>>>>password wrong");
        }catch (AccountException e){
            e.printStackTrace();
            System.out.println(">>>>>>>>>>>>>>>>>>wrong name");
        }
    }
}
