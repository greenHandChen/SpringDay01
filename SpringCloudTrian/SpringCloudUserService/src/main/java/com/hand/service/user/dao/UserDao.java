package com.hand.service.user.dao;

import com.hand.service.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 王俊
 * @Date: 2019/7/26 15:30
 **/
@Mapper
@Repository
public interface UserDao {
    List<User> findAll();

    User findById(Integer id);

    int add(User user);

    int update(User user);

    int delete(Integer id);
}
