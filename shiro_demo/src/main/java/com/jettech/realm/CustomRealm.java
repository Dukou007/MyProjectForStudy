package com.jettech.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @author : dukou_caiqin@163.com
 * @date: 2020/11/5  23:30
 * @description: 自定义realm
 */
public class CustomRealm extends AuthorizingRealm {
    /**
     * @return org.apache.shiro.authz.AuthorizationInfo
     * @description 授权器
     * @author dukou_caiqin@163.com
     * @date 2020/11/5
     * @date [principals]
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String credentials = (String) token.getCredentials();
        String principal = (String) token.getPrincipal();
        if ("zhouxiaolong".equals(principal)) {
            return new SimpleAuthenticationInfo(principal, "1234", this.getName());
        }
        return null;
    }
}
