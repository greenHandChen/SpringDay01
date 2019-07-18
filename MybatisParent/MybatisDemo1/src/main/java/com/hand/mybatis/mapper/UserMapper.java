package com.hand.mybatis.mapper;

import com.hand.mybatis.pojo.QueryVo;
import com.hand.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

     User findUserById(Integer id);

    List<User>  findUserByName(QueryVo vo);

    List<User> selectUserBySexAndName(User user);

//    List<User> findUserByIds(QueryVo vo);
    //  //对应的Mapper的collection 类型是list
    List<User> findUserByIds(List<Integer> ids);
    //对应的Mapper的collection 类型是array
    List<User> findUserByIds(Integer[] ids);


    List<User> LisetUser();
}
