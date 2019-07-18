package com.hand.mybatis.mapper;

import com.hand.mybatis.po.User;
import com.hand.mybatis.po.UserQueryVO;

import java.util.List;

/**
 * @Author xiongyilin
 * @Date 2019/7/18 11:47
 * @Version 1.0
 */

public interface UserMapper {
    public User findUserById(int id) throws Exception;

    public void insertUser(User user) throws Exception;

    public  List<User> findUserList(UserQueryVO vo);

    public  int findUserCount(UserQueryVO vo);

    public User findUserRstMap(int id);
}
