package com.msm.dao.user;

import com.msm.model.User;

import java.util.List;

/**
 * 映射数据库表【t_user】
 * User:gongJin
 * Date:2017/3/3 0003
 * Time:13:09
 */
public interface UserDao {

	/**
	 * 获取所有用户信息
	 * @return
	 */
	List<User> selectAllUserInfo();

}
