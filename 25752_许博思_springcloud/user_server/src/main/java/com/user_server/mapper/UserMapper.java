package com.user_server.mapper;

import com.user_server.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("Select * from user")
    List<User> getAll();
    @Select("select * from user where id=#{id}")
    User getOne(int id);
    @Insert("insert into user(username,address) values(#{username},#{address})")
    void add(User user);
    @Update("update user set username=#{username},address=#{address} where id=#{id}")
    void update(User user);
    @Delete("delete from user where id=#{id}")
    void delete(int id);
}
