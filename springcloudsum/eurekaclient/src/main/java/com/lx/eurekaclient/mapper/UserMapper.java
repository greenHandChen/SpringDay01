package com.lx.eurekaclient.mapper;

import com.lx.eurekaclient.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserById(Integer id);
}
