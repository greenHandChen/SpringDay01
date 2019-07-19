package club.osai.dao;

import club.osai.po.User;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserDao.java
 * @Version: 1.0
 * @Date: 2019/7/19
 * @Description:
 */

public interface UserDao {
    User findUser(Long id);
}
