package org.hgh.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.hgh.pojo.User;

import java.util.List;


public interface UserDao {

    void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory);

    User findUserById(Integer id);

    List<User> findUserByUsername(String username);

    int addUser(User user);
}
