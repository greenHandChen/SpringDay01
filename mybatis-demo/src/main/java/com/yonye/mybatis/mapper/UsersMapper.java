package com.yonye.mybatis.mapper;

import com.yonye.mybatis.pojo.User;
import com.yonye.mybatis.vo.UserQueryVo;

import java.util.List;
import java.util.Map;

/**
 * @Author:Yonye
 * @Date:2019/7/18 11:19
 * @Version:1.0
 * @deseription:
 **/
public interface UsersMapper {
    User findUserById(int id);

    List<User> findUserByUser(UserQueryVo userQueryVo);

    List<User> findUserByMap(Map<String,String> map);

    int countUser();

    User resultMapTest(Integer id);

    List<User> testIfAndWhereLabel(User user);
}
