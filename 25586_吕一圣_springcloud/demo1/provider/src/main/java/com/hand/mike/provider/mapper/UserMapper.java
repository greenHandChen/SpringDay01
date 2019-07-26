package com.hand.mike.provider.mapper;

import com.hand.mike.provider.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
      * @Author: MikeLv
      * @Description: 查询用户信息
      * @Date: 2019/7/26 10:01
      */
    User findUserById(Integer id);

    /**
      * @Author: MikeLv
      * @Description: 删除用户信息
      * @Date: 2019/7/26 10:01
      */
    Integer deleteUserById(Integer id);

    /**
      * @Author: MikeLv
      * @Description: 添加用户
      * @Date: 2019/7/26 10:02
      */
    Integer addUser(User user);

    /**
      * @Author: MikeLv
      * @Description: 更新用户信息
      * @Date: 2019/7/26 10:02
      */
    Integer updateUserById(User user);

    /**
      * @Author: MikeLv
      * @Description: 获取全部用户信息
      * @Date: 2019/7/26 10:03
      */
    List<User> getAllUser();
}
