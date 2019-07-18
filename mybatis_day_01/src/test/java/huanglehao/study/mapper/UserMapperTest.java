package huanglehao.study.mapper;

import huanglehao.study.po.User;
import huanglehao.study.po.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 15:09 2019/7/18
 */
public class UserMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        //读取配置文件
        String resource="config/SqlMapConfig.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        //创建sqlSessionFactory
         sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void findUserById() throws Exception{
        //创建UserMapper对象
       SqlSession sqlSession= sqlSessionFactory.openSession();
        //由mybatis通过sqlsession来创建代理对象
       UserMapper mapper=sqlSession.getMapper(UserMapper.class);
       User user= mapper.findUserById(1);
        System.out.println(user);
        sqlSession.commit();
    }

    @Test
    public void insertUser() throws Exception{
        //创建UserMapper对象
        SqlSession sqlSession= sqlSessionFactory.openSession();
        //由mybatis通过sqlsession来创建代理对象
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user= new User();
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("地狱");
        user.setUsername("人才");
        mapper.insertUser(user);
        sqlSession.commit();
    }


    @Test
    public void findUserList() throws Exception{
        //创建UserMapper对象
        SqlSession sqlSession= sqlSessionFactory.openSession();
        //由mybatis通过sqlsession来创建代理对象
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        UserQueryVo vo=new UserQueryVo();
        User user=new User();
        user.setUsername("人才");
        user.setSex("1");
        vo.setUser(user);
        List<Integer> list=new ArrayList<Integer> ();
        list.add(1);
        list.add(2);
        list.add(10);
        vo.setIdList(list);
        List<User> userList= mapper.findUserList(vo);
        int count=mapper.findUserCount(vo);
        System.out.println(userList);
        System.out.println(count);
        sqlSession.commit();
    }


    @Test
    public void findUserResultMap() throws Exception{
        //创建UserMapper对象
        SqlSession sqlSession= sqlSessionFactory.openSession();
        //由mybatis通过sqlsession来创建代理对象
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
       User user =mapper.findUserResultMap(1);
        System.out.println(user);
        sqlSession.commit();
    }
}