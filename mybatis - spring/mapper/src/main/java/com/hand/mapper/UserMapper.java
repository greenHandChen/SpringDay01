package com.hand.mapper;

import com.hand.VO.UserQueryVO;
import com.hand.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {
    public List<User> showUsers();
    public User findUserById(Integer id);
    public List<User> findUserByName(String username);
    public void addUser(User user);
    public void addUserByUUID(User user);
    public User findUserByUser(UserQueryVO uv);
}
