package Dao;

import Domin.User;

import java.util.List;

//原始Dao开发方式接口
public interface UserDao {

    User findUserById(String id);

    List<User> findUserByUsername(String username);

    int addUser(User user);
}
