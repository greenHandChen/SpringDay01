package com.hand.mapper;

import com.hand.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    UserInfo getUserInfo(int id);
}
