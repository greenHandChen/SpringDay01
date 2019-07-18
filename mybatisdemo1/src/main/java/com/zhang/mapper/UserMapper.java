package com.zhang.mapper;

import com.zhang.pojo.User;
import com.zhang.pojo.UserQueryVo;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public int addUser();
    public List<User> findUsers();
    public User findUserById(Integer id);
    public User findUserByName(String username);

    //通过包装类型UserQueryVo 综合查询
    List<User> findUserByUser(UserQueryVo userQueryVo);

    List<User> findUserByMap(Map<String,String> map);

    User findNameAndAddressById(Integer id);
    User userResultMapTest(Integer id);
    User whereAndIfLabelTest(User user);

    int countUser();

}
