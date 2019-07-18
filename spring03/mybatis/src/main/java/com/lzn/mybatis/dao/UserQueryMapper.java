package com.lzn.mybatis.dao;

import com.lzn.mybatis.entity.UserEntity;
import com.lzn.mybatis.pojo.UserQueryVO;

import java.util.List;

public interface UserQueryMapper {
    List<UserEntity> findUserByUser(UserQueryVO userQueryVO);
}
