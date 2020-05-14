package com.kim.sso.service.impl;

import com.kim.sso.entity.SysUser;
import com.kim.sso.repository.SysUserRepository;
import com.kim.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther kim
 * @create 2020-04-07
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public SysUser getByUsername(String username) {
        return sysUserRepository.findByUsername(username);
    }
}
