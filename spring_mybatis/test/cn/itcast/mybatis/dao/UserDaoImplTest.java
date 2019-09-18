package cn.itcast.mybatis.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.mybatis.po.User;

public class UserDaoImplTest {

	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		//创建spring容器
		
		applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		
		
	}

	@Test
	public void testFindUserById() throws Exception {
		
		//从spring容器中获取UserDao这个bean
		
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.findUserById(1);
		System.out.println(user);
		
		
	}

}
