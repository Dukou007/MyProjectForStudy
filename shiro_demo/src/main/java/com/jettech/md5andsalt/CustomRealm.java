package com.jettech.md5andsalt;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @author : dukou_caiqin@163.com
 * @date: 2020/11/5  23:53
 * @description:
 */
public class CustomRealm extends AuthorizingRealm {
    /**
     * @return org.apache.shiro.authz.AuthorizationInfo
     * @description
     * @author dukou_caiqin@163.com
     * @date 2020/11/5
     * @date [principals]
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * @return org.apache.shiro.authc.AuthenticationInfo
     * @description
     * @author dukou_caiqin@163.com
     * @date 2020/11/5
     * @date [token]
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        return null;
    }
}
