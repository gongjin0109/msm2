package com.msm;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;


/**
 * Created with IDEA
 * User:gongJin
 * Date:2017/3/2 0002
 * Time:20:51
 */
@ContextConfiguration(locations = {"classpath:spring_config.xml", "classpath:spring_mybatis.xml"}) //指定要加载的Spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)//使用该注解注解到测试类上表示将集成Spring TestContext和Junit 4.5+测试框架
@Transactional//表示需要事务支持
@TransactionConfiguration(transactionManager = "transactionManager" , defaultRollback = false)
public class JunitBaseConfig<T> extends AbstractTransactionalJUnit4SpringContextTests{
	   @SuppressWarnings("unchecked")
		Class<T> entityClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		public Logger logger = LoggerFactory.getLogger(entityClass.getClass());
		}





