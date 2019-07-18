package com.zhang.mapper.impl;

import com.zhang.mapper.UserMapper;
import com.zhang.pojo.User;
import com.zhang.pojo.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ClassName:UserMapperImpl
 * Author:ZhangChunjia
 * Date:2019/7/18 11:58
 */
public class UserMapperImpl implements UserMapper {

    private SqlSessionFactory sqlSessionFactory;


    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }


    @Override
    public int addUser() {

        return 0;
    }

    @Override
    public List<User> findUsers() {
        List<User> list=new ArrayList<User>();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        list=sqlSession.selectList("test.findAllUsers");
        sqlSession.close();
        return list;
    }

    @Override
    public User findUserById(Integer id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("test.findUserById",id);
        sqlSession.close();
        return user;
    }

    @Override
    public User findUserByName(String username) {
        //3.读取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行查询,第一个带参数的是命名空间,sql的id,第二个参数是查询的参数
        User user = sqlSession.selectOne("test.findUserByName", "%"+username+"%");
        //System.out.println(user.toString());
        //5.关闭SqlSession
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findUserByUser(UserQueryVo userQueryVo) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> list=sqlSession.selectList("findUserByUser");
        return null;
    }

    @Override
    public List<User> findUserByMap(Map<String, String> map) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> list=sqlSession.selectList("findUserByMap");
        return list;
    }
    @Override
    public User findNameAndAddressById(Integer id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("findNameAndAddressById");
        return user;
    }

    @Override
    public User userResultMapTest(Integer id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //测试使用resultMap结果映射
        User user1=sqlSession.selectOne("userResultMapTest");
        return user1;
    }

    @Override
    public User whereAndIfLabelTest(User user) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        user=sqlSession.selectOne("whereAndIfLabelTest");
        return user;
    }

    @Override
    public int countUser() {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        int k=sqlSession.selectOne("countUser");
        return k;
    }
}
