package com.hand.Mapper;

import com.hand.domain.User;
import com.hand.domain.UserQueryVO;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public abstract User findUserById(Integer id);
    public abstract List<User> findUserByUsername(String username);
    public abstract int addUser(User user);
    public abstract int addUserGetId(User user);
    List<User> findUserByUser(UserQueryVO userQueryVO);
    List<User> findUserByMap(Map<String,String> map);
    int countUser();
    User testResultMap(Integer id);
    List<User> testIfAndWhereLabel(User user);
}
