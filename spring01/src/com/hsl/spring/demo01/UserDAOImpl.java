package com.hsl.spring.demo01;
/**
 * 用户管理DAO层实现类
 * @author jt
 *
 */
public class UserDAOImpl implements UserDAO {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void save() {
		System.out.println("UserDAOImpl执行了..."+name);
	}

}
