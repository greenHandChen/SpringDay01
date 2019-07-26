package club.osai.userservice.dao;

import club.osai.userservice.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: UserDao.java
 * @Version: 1.0
 * @Date: 2019/7/26
 * @Description:
 */

public interface UserDao extends JpaRepository<User, Long> {
    List<User> findByNameLike(String name);

    User findByName(String name);
}
