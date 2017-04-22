package com.msm.service.impl;

import com.msm.dao.user.UserDao;
import com.msm.dao.user.SysUserDao;
import com.msm.model.SysUser;
import com.msm.model.User;
import com.msm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Resource
	private SysUserDao SysUserDao;


	@Override
	public List<User> selectAllUserInfo() {
		return userDao.selectAllUserInfo();
	}

	@Override
	public List<SysUser> findAll() {
		return SysUserDao.findAll();
	}
}
