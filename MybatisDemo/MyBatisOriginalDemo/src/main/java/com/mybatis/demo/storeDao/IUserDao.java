package com.mybatis.demo.storeDao;

import com.mybatis.demo.storeDto.User;

import java.util.List;

public interface IUserDao {
     User selectUserInfo(int id);
     List<User> selectUser(String name);
     int addUser();
}
