package com.hand.mapper;

import com.hand.VO.UserQueryVO;
import com.hand.domain.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
      * @Author: MikeLv
      * @Description: 根据id查询用户
      * @Date: 2019/7/18 14:36
      */
    User findUserById(Integer id);

    /**
      * @Author: MikeLv
      * @Description: 根据用户名获取用户列表
      * @Date: 2019/7/18 14:37
      */
    List<User> findUserByUsername(String username);

    /**
      * @Author: MikeLv
      * @Description: 添加用户
      * @Date: 2019/7/18 14:38
      */
    int addUser(User user);

    /**
      * @Author: MikeLv
      * @Description: 综合查询
      * @Date: 2019/7/18 15:34
      */
    List<User> findUserByUser(UserQueryVO userQueryVO);

    /**
      * @Author: MikeLv
      * @Description: map查询
      * @Date: 2019/7/18 15:46
      */
    List<User> findUserByMap(Map<String,String> map);

    /**
      * @Author: MikeLv
      * @Description: 查询用户总数
      * @Date: 2019/7/18 15:54
      */
    int countUser();

    /**
      * @Author: MikeLv
      * @Description: 通过ID获取用户名以及地址
      * @Date: 2019/7/18 15:58
      */
    User findUserNameAndAddressById(Integer id);

    /**
      * @Author: MikeLv
      * @Description: 通过ID获取id，用户名以及地址
      * @Date: 2019/7/18 16:07
      */
    User testResultMap(Integer id);

    /**
      * @Author: MikeLv
      * @Description: 动态SQL查询
      * @Date: 2019/7/18 16:13
      */
    List<User> testIfAndWhereLabel(User user);
}
