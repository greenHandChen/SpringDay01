package com.airyny.service.user.mapper;

import com.airyny.service.user.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/26 10:04
 * @Version:1.0
 * @deseription:
 **/
@Mapper
public interface UserMapper {
    List<User> selectAll();

   User findUserById(Integer id);

    List<User> findUserByUserName(String username);

    int delUserById(Integer id);

    int updateByPrimaryKey(User user);

    int insertSelective(User user);

    int updateByPrimaryKeySelective(User user);
}
