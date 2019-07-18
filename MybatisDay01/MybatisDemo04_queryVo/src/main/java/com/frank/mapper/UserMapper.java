package com.frank.mapper;

import com.frank.pojo.User;
import com.frank.pojo.UserQueryVO;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 根据id查询用户
     * @param userQueryVO
     * @return User
     */
    User findUserByUser(UserQueryVO userQueryVO);

    /**
     * 根据map查询用户
     * @param map
     * @return
     */
    List<User> findUserByMap(Map<String,String> map);

    /**
     * 查询用户总数
     * @return
     */
    int countUser();

    /**
     * 根据id查找用户名和地址
     * @param id
     * @return
     */
    User findUsernameAndAddressById(Integer id);

    /**
     * 通过id获取用户名以及地址
     * @param id
     * @return
     */
    User testResultMap(Integer id);

    /**
     * 动态sql查询
     * @param user
     * @return
     */
    List<User> testIfAndWhereLabel(User user);

}
