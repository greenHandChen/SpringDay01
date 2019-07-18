package com.hand.Dao;

import com.hand.domain.User;
import com.hand.domain.UserQueryVO;

import java.util.List;

public interface UserDao {
    public abstract User findUserById(Integer id);
    public abstract List<User> findUserByUsername(String username);
    public abstract int addUser(User user);
    public abstract int addUserGetId(User user);

}
