package com.hand.TestMybatis;



import com.hand.Dao.UserDaoImpl;
import com.hand.Mapper.UserMapper;
import com.hand.domain.User;
import com.hand.domain.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMY {
    InputStream inputStream = null;
    private SqlSessionFactory sqlSessionFactory ;
    @Before
    public void before() throws IOException {
        //1.读取全局配置文件
        inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2.创建SqlSessionFactory
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void test1() throws IOException {
        //3.获取sqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4.执行查询，第一个参数是命名空间，第二个参数是查询的参数
        User user=sqlSession.selectOne("com.hand.Mapper.UserMapper.findUserById",1);
        System.out.println(user);
        //5.关闭流
        sqlSession.close();
    }
    @Test
    public void test2() throws IOException {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("com.hand.Mapper.UserMapper.findUserByUsername","'%明%' OR 1=1");
        System.out.println(list);
        sqlSession.close();
    }
    @Test
    public void test3() throws IOException {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setUsername("yanzhen");
        user.setAddress("湖北");
        user.setSex(2);
        sqlSession.insert("com.hand.Mapper.UserMapper.addUser",user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test4() throws IOException {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setUsername("腰困！");
        user.setAddress("湖北");
        user.setSex(2);
        sqlSession.insert("com.hand.Mapper.UserMapper.addUserGetId",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test5() throws IOException {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setUsername("你猜我是谁！");
        user.setAddress("湖北");
        user.setSex(1);
        sqlSession.insert("com.hand.Mapper.UserMapper.addUserGetId",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testDao(){
        UserDaoImpl userDao=new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        System.out.println(userDao.findUserById(27));
        System.out.println(userDao.findUserByUsername("yan"));
        User user=new User();
        user.setUsername("腰困");
        user.setAddress("湖北武汉");
        user.setSex(1);
        System.out.println(userDao.addUser(user));
    }
    @Test
    public void testDao2(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findUserById(33));
        sqlSession.close();
    }
    @Test
    public void testDao3(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=new User();
        UserQueryVO userQueryVO=new UserQueryVO();
        user.setAddress("北京市");
        user.setSex(1);
        userQueryVO.setUser(user);
        System.out.println(mapper.findUserByUser(userQueryVO));
        sqlSession.close();
    }
    @Test
    public void testDao4(){
       SqlSession sqlSession = sqlSessionFactory.openSession();
       UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
       Map<String,String> map = new HashMap<String, String>();
       map.put("username","小");
        System.out.println(userMapper.findUserByMap(map));
       sqlSession.close();
    }

    @Test
    public void testDao5(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.countUser());
        sqlSession.close();
    }
    @Test
    public void testDao6(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.testResultMap(33));
        sqlSession.close();
    }
    @Test
    public void testDao7(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setUsername("小");
        System.out.println(userMapper.testIfAndWhereLabel(user));
        sqlSession.close();
    }
}
