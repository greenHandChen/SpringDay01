package com.hand.eureka.server.mapper;

import com.hand.eureka.server.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
