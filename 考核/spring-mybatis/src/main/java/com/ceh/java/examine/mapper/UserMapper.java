package com.ceh.java.examine.mapper;

import com.ceh.java.examine.domain.User;

/**
 * Created by enHui.Chen on 2019/7/11.
 */
public interface UserMapper {

     /**
       * @Author: enHui.Chen
       * @Description: 查询用户信息
       * @Data 2019/7/20
       */
    User findUserById(Integer id);
}

