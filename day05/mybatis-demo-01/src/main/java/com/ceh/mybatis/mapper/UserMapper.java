package com.ceh.mybatis.mapper;

import com.ceh.mybatis.domain.User;
import com.ceh.mybatis.domain.UserQueryVO;

import java.util.List;
import java.util.Map;

/**
 * Created by enHui.Chen on 2019/7/9.
 */
public interface UserMapper {
    /**
     * @Author: enHui.Chen
     * @Description: 根据id查询用户
     * @Data 2019/7/8
     */
    User findUserById(Integer id);

    /**
     * @Author: enHui.Chen
     * @Description: 根据用户名获取用户列表
     * @Data 2019/7/8
     */
    List<User> findUserByUsername(String username);

    /**
     * @Author: enHui.Chen
     * @Description: 添加用户
     * @Data 2019/7/8
     */
    int addUser(User user);

    /**
     * @Author: enHui.Chen
     * @Description: 综合查询
     * @Data 2019/7/9
     */
    List<User> findUserByUser(UserQueryVO userQueryVO);

    /**
     * @Author: enHui.Chen
     * @Description: map查询
     * @Data 2019/7/9
     */
    List<User> findUserByMap(Map<String, String> map);

    /**
     * @Author: enHui.Chen
     * @Description: 查询用户总数
     * @Data 2019/7/9
     */
    int countUser();

    /**
     * @Author: enHui.Chen
     * @Description: 通过ID获取用户名以及地址
     * @Data 2019/7/9
     */
    User findUserNameAndAddressById(Integer id);

    /**
     * @Author: enHui.Chen
     * @Description: 通过ID获取id, 用户名以及地址
     * @Data 2019/7/9
     */
    User testResultMap(Integer id);

     /**
       * @Author: enHui.Chen
       * @Description: 动态SQL查询
       * @Data 2019/7/9
       */
    List<User> testIfAndWhereLabel(User user);
}
