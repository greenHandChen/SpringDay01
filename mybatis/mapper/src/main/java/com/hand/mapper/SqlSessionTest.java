package com.hand.mapper;

import com.hand.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description mapper test 1
 * @Param
 * @Return
 * @Author yunfeng.ye
 * @Date 2019/7/18
 * @Time 16:39
 */
public class SqlSessionTest {

    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
      /*  User user=]
      qlSession.selectOne("test.findUserById",1);
        //        List<User> users=sqlSession.selectList("test.findUserByName","陈%");
        //        //System.out.println(user);*/
        User user1 = new User();
        user1.setId(231);
        user1.setUsername("林4林");
        //Integer key=sqlSession.insert("test.addUser",user1);
        sqlSession.insert("test.addUserByUUID",user1);
        List<User> users=sqlSession.selectList("test.showUsers");
        System.out.println(users);
        //System.out.println("*********"+key);
        sqlSession.commit();
        sqlSession.close();
    }
}
