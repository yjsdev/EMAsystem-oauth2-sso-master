package com.kim.sso.vo;

import com.kim.sso.entity.SysUser;
import lombok.Data;

import java.util.List;

/**
 * @auther kim
 * @create 2020-04-07
 */
@Data
public class SysUserVO extends SysUser {

    /**
     * 权限列表
     */
    private List<String> authorityList;

}
