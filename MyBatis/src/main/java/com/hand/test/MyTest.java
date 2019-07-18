package com.hand.test;

import com.hand.dao.IUserDao;
import com.hand.dao.impl.UserDaoImpl;
import com.hand.entity.Orders;
import com.hand.entity.QueryUser;
import com.hand.entity.User;
import com.hand.entity.UsersOrders;
import com.hand.mapper.OrdersMapper;
import com.hand.mapper.UserMapper;
import com.hand.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class MyTest {

    @Test
    public void test01() {
        SqlSession sqlSession = null;
        User user = new User("Fandelu", new Date(), '男', "南宁市");
        try {
            InputStream inputStream = Resources.getResourceAsStream("config/mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
            System.out.println(user);
            int result = sqlSession.insert("com.hand.mapper.UserMapper.insertUser", user);
            System.out.println(user);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            if (sqlSession != null) sqlSession.rollback();
            e.printStackTrace();
        } finally {
            if (sqlSession != null) sqlSession.close();
        }
    }

    @Test
    public void test02() {
        User user = new User("Fandelu", new Date(), '男', "南宁市");
        IUserDao userDao = new UserDaoImpl();
        userDao.insertUser(user);
    }

    SqlSessionFactory sqlSessionFactory;
    IUserDao userDao;

    @Before
    public void setUp() {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("config/mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        userDao = new UserDaoImpl();
    }

    @Test
    public void test03() {
        System.out.println(userDao.selectUserById(1));
    }

    @Test
    public void test04() {
//        System.out.println(userDao.selectAll());
//        List<User> userList = userDao.selectAll();
//        SqlSession session = sqlSessionFactory.openSession();
//        IUserDao userDao = session.getMapper(IUserDao.class);
//        List<User> userList = userDao.selectAllUser();
//        for (User user : userList) {
//            System.out.println(user);
//        }

        SqlSession session = MyBatisUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        System.out.println(userMapper.selectAllUser());
        session.close();
    }

    //通过代理类来执行操作
    @Test
    public void test05() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        System.out.println(userMapper.selectUserById(1));
        session.close();
    }

    @Test
    public void testDelete() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        System.out.println(userMapper.deleteUserById(35));
        session.commit();
        session.close();
    }

    @Test
    public void testMap() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        System.out.println(userMapper.selectUserToMapById(1));
        session.close();
    }

    @Test
    public void test06() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        QueryUser queryUser = new QueryUser();
        queryUser.setUser(new User());
        queryUser.getUser().setSex('男');
        System.out.println(userMapper.selectUserByUserSex(queryUser));
        session.close();
    }

    /**
     * 测试动态sql
     */
    @Test
    public void testDTSQL() {
        SqlSession session = MyBatisUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("an");
        System.out.println(userMapper.selectUserUncheck(user));
        session.close();
    }

    /**
     * 测试一对多查询
     */
    @Test
    public void testOneToMore() {
        SqlSession session = MyBatisUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);

        printColl(userMapper.selectUserAndOrders(1));

        session.close();
    }

    /**
     * 多对一查询
     */
    @Test
    public void testManyToOne() {
        SqlSession session = MyBatisUtil.getSqlSession();

        OrdersMapper ordersMapper = session.getMapper(OrdersMapper.class);

        System.out.println(ordersMapper.selectOrdersUsers(1));

        session.close();
    }

    private void printColl(Collection<?> objColl) {
        for (Object obj : objColl) {
            if (obj instanceof UsersOrders) {
                UsersOrders usersOrders = (UsersOrders) obj;
                for (Orders orders : usersOrders.getOrdersList()) {
                    System.out.println(usersOrders.getUser_id() + "\t" +
                            usersOrders.getUsername() + "\t" +
                            usersOrders.getSex() + "\t" +
                            usersOrders.getBirthday() + "\t" +
                            usersOrders.getAddress() + "\t" +
                            orders.getId() + "\t" +
                            orders.getNumber() + "\t" +
                            orders.getCreatetime() + "\t" +
                            orders.getNote() + "\t"

                    );
                }
            }
        }
    }

}
