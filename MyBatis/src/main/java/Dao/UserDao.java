package Dao;

import Entity.User;

import java.util.List;

public interface UserDao {
    User findUserByUserId(Integer id);
    List<User> findUserByUsername(String username);
    int addUser(User user);
}
