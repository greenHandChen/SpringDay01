package com.hand.provider.mapper;

import com.hand.provider.pojo.User;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    User findUserById(Integer id);

    void  addUser(User user);

    List<User> selectMoreByMore();

    User selectUserBySexAndName(Map<String, Object> params);

}
