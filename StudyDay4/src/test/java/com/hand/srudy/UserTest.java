package com.hand.srudy;

import com.hand.srudy.dao.UserDao;
import com.hand.srudy.domain.User;
import com.hand.srudy.domain.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserTest {

    @Test
    public void testFindUserById() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        User user = userDao.findUserById(1L);
        System.out.println(user);
        //6.释放资源
        session.close();
        in.close();

    }

    @Test
    public void testFindUserByUsername() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        List<User> list = userDao.findUserByUsername("'张%'");
        for(User user:list) {
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();

    }


    @Test
    public void testAddUser() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        User user = new User();
        user.setAddress("芜湖");
        user.setUsername("lwy");
        user.setSex("男");
        Long i = userDao.addUser(user);
        //session.commit();
        System.out.println(i);
        //6.释放资源
        session.close();
        in.close();

    }

    @Test
    public void testAddUserGetId() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        User user = new User();
        user.setAddress("芜湖");
        user.setUsername("tlq");
        user.setSex("男");
        Long i = userDao.addUserGetId(user);
        System.out.println(i);
        System.out.println(user.getUserId());
        session.commit();
        //6.释放资源
        session.close();
        in.close();

    }


    @Test
    public void testAddUserGetUUID() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        User user = new User();
        user.setAddress("芜湖1");
        user.setUsername("tlq1");
        user.setSex("男");
        Long i = userDao.addUserGetUUID(user);
        System.out.println(i);
        System.out.println(user.getUserId());
        session.commit();
        //6.释放资源
        session.close();
        in.close();

    }


    @Test
    public void testFindUserByUser() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        User user = new User();
        user.setSex("1");
        user.setAddress("河南");
        UserQueryVO userQueryVO = new UserQueryVO();
        userQueryVO.setUser(user);

        List<User> list = userDao.findUserByUser(userQueryVO);
        for(User users:list) {
            System.out.println(users);
        }
        //6.释放资源
        session.close();
        in.close();

    }


    @Test
    public void testFindUserByMap() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        Map<String ,String> map = new HashMap<String, String>();
        map.put("username" ,"小");

        List<User> list = userDao.findUserByMap(map);
        for(User users:list) {
            System.out.println(users);
        }
        //6.释放资源
        session.close();
        in.close();

    }


    @Test
    public void testCountUser() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法

        System.out.println(userDao.countUser());
        //6.释放资源
        session.close();
        in.close();

    }


    @Test
    public void testFindUsernameAndAddressById() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        User user = userDao.findusernameAndAddressById(10L);
        System.out.println(user);
        //6.释放资源
        session.close();
        in.close();

    }

    @Test
    public void testFindUserByIdMap() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法

        System.out.println(userDao.findUserByIdMap(10L));
        //6.释放资源
        session.close();
        in.close();

    }

    @Test
    public void testIfAndWhereLabel() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        User user = new User();
        // user.setUserId(10L);
        user.setUsername("小");
        List<User> list = userDao.testIfAndWhereLabel(user);
        for(User user1:list){
            System.out.println(user1);
        }
        //6.释放资源
        session.close();
        in.close();

    }

}