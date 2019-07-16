package com.hsl.spring.demo01;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Spring的入门
 * @author jt
 *
 */
public class SpringDemo1 {

	@Test
	/**
	 * 传统方式的调用
	 */
	public void demo1(){
		UserDAOImpl userDAO = new UserDAOImpl();
		userDAO.setName("hsl");
		userDAO.save();
	}
	@Test
	/**
	 * Spring的方式的调用
	 */
	public void demo2(){
		// 创建Spring的工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
		userDAO.save();
	}

}
