package com.wzh.mapper;

import com.wzh.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper {
    public User findUserById(int id);
}
