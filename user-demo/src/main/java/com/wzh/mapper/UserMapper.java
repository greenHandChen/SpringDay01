package com.wzh.mapper;

import com.wzh.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public User findUserById(int id);

    public int updateUser(User user);

    public int deleteUser(int id);

    public int insertUser(User user);
}
