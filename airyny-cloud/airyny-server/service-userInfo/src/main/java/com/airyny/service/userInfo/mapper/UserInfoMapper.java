package com.airyny.service.userInfo.mapper;

import com.airyny.service.userInfo.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author:Yonye
 * @Date:2019/7/26 11:17
 * @Version:1.0
 * @deseription:
 **/
@Mapper
public interface UserInfoMapper {

    UserInfo selectByUserId(Integer id);

}
