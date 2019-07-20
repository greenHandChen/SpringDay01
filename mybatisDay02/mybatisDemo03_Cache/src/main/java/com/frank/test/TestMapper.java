package com.frank.test;

import com.frank.mapper.OrderMapper;
import com.frank.mapper.UserMapper;
import com.frank.pojo.Order;
import com.frank.pojo.OrderUser;
import com.frank.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class TestMapper {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private UserMapper userMapper;
    private OrderMapper orderMapper;
    /**
     * 初始化信息
     * @throws IOException
     */
    @Before
    public void init() throws IOException {
        //加载文件流
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //创建openSession对象
        sqlSession = sqlSessionFactory.openSession();
        //创建userMapper对象
        userMapper = sqlSession.getMapper(UserMapper.class);
        //创建orderMapper对象
        orderMapper = sqlSession.getMapper(OrderMapper.class);
    }

    /**
     * 关闭资源
     */
    @After
    public void destroy(){
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 测试一级缓存
     */
    @Test
    public void test01() {
        List<User> list1 = userMapper.findAll();
        for (User user : list1) {
            System.out.println(list1);
        }
        List<User> list2 = userMapper.findAll();
        for (User user : list2) {
            System.out.println(list2);
        }

    }
    /**
     * 中间添加用户之后会清空缓存重新查询
     */
    @Test
    public void test02(){
        List<User> list1 = userMapper.findAll();
        for (User user1 : list1) {
            System.out.println(list1);
        }
        User user = new User();
        user.setUsername("赵云");
        user.setAddress("湖北荆州");
        user.setBirthday(new Date());
        userMapper.addUser(user);
        System.out.println("测试缓存");
        List<User> list2 = userMapper.findAll();
        for (User user2 : list2) {
            System.out.println(list2);
        }
    }



}
