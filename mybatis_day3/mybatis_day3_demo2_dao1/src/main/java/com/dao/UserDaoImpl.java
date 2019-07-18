package com.dao;

import com.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 15:43 2019/7/18
 * @Modified By:
 */
public class UserDaoImpl implements IUserDao {

    //依赖注入--1.spring中的di，注解,配置bean 2.构造方法
    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(Integer id) throws IOException {

        //SqlSessionFactory生命周期不应该频繁创建，应该在整个application中，只需要一个，使用单例模式来管理SqlSessionFactory
        //SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));

        //SqlSession,内部含有一块数据区域，存在线程不安全问题，所以不能将SqlSession升级为成员变量，只能在方法中声明为局部变量
        SqlSession sqlSession=sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("findUserById",25);

        sqlSession.close();
        return user;
    }

    public List<User> findUsersByName(String name) {
        SqlSession sqlSession=sqlSessionFactory.openSession();

        List<User> userList = sqlSession.selectOne("findUsersByName","%"+name+"%");

        sqlSession.close();
        return userList;
    }

    public boolean insertUser(User user) {
        SqlSession sqlSession=sqlSessionFactory.openSession();

        int n = sqlSession.insert("test.addUser",user);
        //需要手动commit,否则不会加入成功
        sqlSession.commit();
        if(n>=1){
//            System.out.println("插入成功:"+user);
            return true;
        }else{
//            System.out.println("插入失败:"+user);
            return false;
        }
    }
}
