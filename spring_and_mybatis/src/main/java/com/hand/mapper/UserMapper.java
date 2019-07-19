package com.hand.mapper;

import com.hand.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User getUserById(@Param("id") Integer id);

}
