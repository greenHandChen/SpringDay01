package com.txz.mybatis.mapper;

import com.txz.mybatis.domain.User;
import com.txz.mybatis.domain.UserQueryVO;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //根据id查询用户
    User findUserById(Integer id);

    //根据用户名获取用户列表
    List<User> findUserByUsername(String username);

    //添加用户
    int addUser(User user);

    //综合查询
    List<User> findUserByUser(UserQueryVO userQueryVO);

    //map查询
    List<User> findUserByMap(Map<String,String> map);

    //查询用户总数
    int countUser();

    //通过ID获取用户名以及地址
    User findUserNameAndAddressById(Integer id);

    //通过ID获取用户名，id和地址
    User testResultMap(Integer id);

    //根据ID获取用户信息
    List<User> testIfAndWhereLabel(User user);
}
