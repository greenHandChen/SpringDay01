package com.user.userservice.mapper;

import com.user.userservice.pojo.User;

public interface UserMapper {
    /*
        通过姓名找到User
     */
    User findUserByName(String name);

    /*
        通过姓名删除数据
     */
    String deleteUserInfoByName(String name);

    /*
        查询信息是否已经逻辑删除
     */
    int findUserIsDel(String name);

    /*
        增加数据
     */
    void insertUserInfo(User user);
}
