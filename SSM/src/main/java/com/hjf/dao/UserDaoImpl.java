package com.hjf.dao;
import com.hjf.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * ClassName:UserDaoImpl
 * Author:Hejunfeng
 * Date:2019/7/19 20:16
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    public User findUserById(Integer id) {
        System.out.println("sssssssssss");
        return getSqlSession().selectOne("test.findUserById",id);
    }
}