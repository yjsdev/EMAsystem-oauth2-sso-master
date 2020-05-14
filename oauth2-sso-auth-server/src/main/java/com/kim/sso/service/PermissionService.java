package com.kim.sso.service;

import com.kim.sso.entity.SysPermission;

import java.util.List;

/**
 * @auther kim
 * @create 2020-04-07
 */
public interface PermissionService {

    List<SysPermission> findByUserId(Integer userId);

}
