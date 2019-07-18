package club.osai.dao;

import club.osai.po.User;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserDao.java
 * @Version: 1.0
 * @Date: 2019/7/18
 * @Description:
 */

public interface UserDao {
    User findUserById(Long id);

    List<User> findUserByUsername(String username);

    int addUser(User user);
}
