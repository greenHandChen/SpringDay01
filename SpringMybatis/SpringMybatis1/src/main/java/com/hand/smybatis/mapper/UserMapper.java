package com.hand.smybatis.mapper;

import com.hand.smybatis.pojo.User;

import java.util.List;

public interface UserMapper {

	 User findUserById(Integer id);
	 List<User> selectUserAndOrderById();

	 List<User> selectMoreByMore();

}
