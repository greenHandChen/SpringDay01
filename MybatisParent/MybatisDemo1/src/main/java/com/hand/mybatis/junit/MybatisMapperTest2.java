package com.hand.mybatis.junit;

import com.hand.mybatis.mapper.OrderMapper;
import com.hand.mybatis.mapper.UserMapper;
import com.hand.mybatis.pojo.Order;
import com.hand.mybatis.pojo.QueryVo;
import com.hand.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MybatisMapperTest2 {

    @Test
    public void testFindUserByIds() throws Exception {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //SqlSEssion帮我生成一个实现类  （给接口）
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        List<Order> orders = orderMapper.selectOrderByUserId();
        for (Order user1 : orders
        ) {
            System.out.println(user1);
        }


    }

    @Test
    public void LisetUserTest() throws Exception {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //SqlSEssion帮我生成一个实现类  （给接口）
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        QueryVo vo = new QueryVo();
//        vo.setListids(ids);



//        List<User> users = userMapper.findUserByIds(vo);
        //对应的Mapper的collection 类型是list
        List<User> users = userMapper.LisetUser();
        for (User user1 : users
        ) {

            System.out.println(user1);
        }


    }


}
