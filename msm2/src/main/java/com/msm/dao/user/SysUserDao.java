package com.msm.dao.user;


import com.msm.model.SysUser;

import java.util.List;

/**
 * 系统用户DAO
 */
public interface SysUserDao {

    /**
     * 返回所有数据
     * @return
     */
    List<SysUser> findAll();

}