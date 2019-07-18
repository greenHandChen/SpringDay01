package com.zt.mybatis.mapper;

import com.zt.mybatis.domain.User;
import com.zt.mybatis.domain.UserQueryVO;

import java.util.List;
import java.util.Map;

/**
 * @description: mybatis基于dao的Mapper代理方式开发，类名需与namespace同名
 * @author: invokerZt
 * @date: 2019-07-18 11:20
 */
public interface UserMapper {

    /**
     * @description: 方法名需要与XML文件的statement的id一致，
     *               参数需要与parameterType的值一致，
     *               返回值需要与resultType的值一致
     * @author: invokerZt
     * @date: 2019-07-18 11:24
     * @param null:
     * @return:
     */
    User findUserById(Integer id);

    User findUserByUsername(String username);

    int addUser(User user);

    List<User> findUserByUser(UserQueryVO userQueryVO);

    List<User> findUserByMap(Map<String, String> map);

    List<User> findUserByIfAndWhereLabel(User user);
}
