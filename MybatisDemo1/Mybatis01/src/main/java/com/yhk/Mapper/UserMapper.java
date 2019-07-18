package com.yhk.Mapper;

import com.yhk.Pojo.User;
import com.yhk.Pojo.UserQueryVO;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User findUserById(Integer id);
    List<User> findUserByUsername(String username);
    int addUser(User user);

    /**
     * 综合查询
     */
    List<User> findUserByUser(UserQueryVO userQueryVO);

    /**
     * map查询
     */
    List<User> findUserByMap(Map<String,String> map);

    /**
     * 查询用户总数
     */
    int countUser();
    /**
     * 通过ID获取用户名和地址
     */
    User findUsernameAndAddressById(Integer id);

    /**
     * 测试map映射
     */
    User testResultMap(Integer id);

    /**
     * 测试动态sql
     */
    List<User> testIfAndWhere(User user);
}
