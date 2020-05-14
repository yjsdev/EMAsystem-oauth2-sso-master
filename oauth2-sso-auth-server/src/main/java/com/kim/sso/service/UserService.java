package com.kim.sso.service;

import com.kim.sso.entity.SysUser;

/**
 * @auther kim
 * @create 2020-04-07
 */
public interface UserService {

    SysUser getByUsername(String username);
}
