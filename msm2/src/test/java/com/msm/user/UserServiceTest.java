package com.msm.user;

import com.msm.JunitBaseConfig;
import com.msm.model.SysUser;
import com.msm.model.User;
import com.msm.service.UserService;
import net.sf.json.JSONArray;
import org.apache.log4j.Logger;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * User:gongJin
 * Date:2017/3/3 0003
 * Time:13:48
 */
public class UserServiceTest extends JunitBaseConfig<UserServiceTest> {

	Logger logger = Logger.getLogger(UserServiceTest.class);

	@Resource
	private UserService userService;
	@Test
	public void test1(){
		List<User> list = userService.selectAllUserInfo();
		System.out.print(JSONArray.fromObject(list).toString());
	}
	@Test
	public void test2(){
		List<SysUser> list = userService.findAll();
		System.out.print(JSONArray.fromObject(list).toString());
	}
}
