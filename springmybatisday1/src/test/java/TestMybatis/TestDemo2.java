package TestMybatis;

import com.softeem.dao.UserDao;
import com.softeem.dto.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

/*
* 测试用户返回自增主键*/
public class TestDemo2 {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException{
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void demo1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setAddress("石首");
        user.setBirthday(new Date());
        user.setUsername("123大懒缘");
        user.setSex(2);

        int i = sqlSession.insert("com.softeem.dao.UserDao.addUser1",user);
        sqlSession.commit();
        System.out.println(user.getId());

    }

    @Test
    public void demo2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setAddress("湖北");
        user.setBirthday(new Date());
        user.setUsername("大懒缘");
        user.setSex(1);
        user.setId(Integer.valueOf(UUID.randomUUID().toString().replace("-","")));
        int i = sqlSession.insert("com.softeem.dao.UserDao.addUser2",user);
        sqlSession.commit();
        //  int uuid = Integer.valueOf(user.getId());
        System.out.println(user.getId());

    }

    @Test
    public void demo3(){
        SqlSession sqlSession =  sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        System.out.println( userDao.countUser());
        sqlSession.close();

    }

}
