package com.jmx.dao;

import com.jmx.domain.Account;
import com.mysql.cj.xdevapi.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
/**
 *Created by minxi.jiang on 2019/7/18
 */
public class UserDaoImpl implements  UserDao{
    /*全局唯一的属性*/
    private SqlSessionFactory sqlSessionFactory;

    /*注入sessionfactory*/
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }
    public Account findUserById(Integer id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Account account=sqlSession.selectOne("test.findUserById",id);
        sqlSession.close();
        return account;
    }

    public List<Account> findUserByName(String username) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        System.out.println(username);
        List<Account> lists=sqlSession.selectList("test.findUserByName",username);
        System.out.println(lists);
        sqlSession.close();
        return lists;
    }

    public int addUser(Account account) {
         SqlSession sqlSession=sqlSessionFactory.openSession();
         int a=sqlSession.insert("test.addUser",account);
         sqlSession.commit();
         sqlSession.close();
         sqlSession.close();
         return a;
    }
}
