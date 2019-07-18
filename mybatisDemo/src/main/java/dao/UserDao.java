package dao;

import domain.User;

import java.util.List;

public interface UserDao {

    User findUserById(Integer id);

    List<User> findUserByUsername(String username);
}
