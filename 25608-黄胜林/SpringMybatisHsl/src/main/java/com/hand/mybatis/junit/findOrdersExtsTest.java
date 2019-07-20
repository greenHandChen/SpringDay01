package com.hand.mybatis.junit;

import com.hand.mybatis.mapper.OrderMapper;
import com.hand.mybatis.pojo.OrdersExt;
import com.hand.mybatis.pojo.QueryVo;
import com.hand.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class findOrdersExtsTest  {



    @Test
    public void testQueryMapper() throws Exception {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //SqlSEssion帮我生成一个实现类  （给接口）
        OrderMapper userMapper = sqlSession.getMapper(OrderMapper.class);

        User user = new User();
        user.setUsername("张");
        QueryVo vo = new QueryVo();
        vo.setUser(user);

        List<OrdersExt> u = userMapper.findOrdersExts(vo);
        for (OrdersExt s : u) {
            System.out.println(s);
        }

    }
}
