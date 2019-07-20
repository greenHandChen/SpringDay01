package com.wzh.mapper;

import com.wzh.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
   User findUserById(int id);
   int insertUser(User user);
   int updateUser(User user);
   int deleteUser(int id);
   int countUsers();
}
