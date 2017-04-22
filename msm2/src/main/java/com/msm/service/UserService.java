package com.msm.service;


import com.msm.model.SysUser;
import com.msm.model.User;

import java.util.List;

public interface UserService {
	/**
	 * 获取所有用户信息
	 * @return
	 */
	List<User> selectAllUserInfo();

	List<SysUser> findAll();
}
