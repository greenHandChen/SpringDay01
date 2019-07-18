package com.ljx.mybatisdao.dao;

import java.util.List;

import com.ljx.mybatisdao.domain.User;

/**
 *功能描述
 * @author LJX
 * @date 2019/7/18 11:10
 */
public interface UserDao {
	// 1、 根据用户ID查询用户信息
	public User findUserById(int id) throws Exception;

	// 2、 根据用户名称模糊查询用户列表
	public List<User> findUsersByName(String name) throws Exception;

	// 3、 添加用户
	public void insertUser(User user) throws Exception;

}
