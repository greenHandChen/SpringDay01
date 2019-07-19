package com.mybatis.demo;

import com.mybatis.mapper.OrderMapper;
import com.mybatis.pojo.OrderEx;
import com.mybatis.pojo.Orderdetail;
import com.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @description: 测试类
 * @author: xueWu.Chen
 * @create: 2019-07-19
 **/

public class DoTest {


    public SqlSession getSqlSession()throws IOException{
        // 读取全局配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessoinFactory工厂 ，并将全局配置文件编译
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 创建SqlSession会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

    @Test
    public void testOneToOne() throws IOException{
        SqlSession sqlSession = getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderEx> orx = orderMapper.getOrderAndUser();
        for (OrderEx o: orx
             ) {
            System.out.print(o.getNumber()+" "+o.getCreatetime()+" ");
            System.out.println(o.getUser().getId()+" "+o.getUser().getUsername());
        }
        sqlSession.close();

    }

    @Test
    public void testOneToMore() throws IOException{
        SqlSession sqlSession = getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderEx> orx = orderMapper.getOderUserDetail();
        for (OrderEx ox: orx
             ) {
            System.out.print(ox.getUser().getUsername()+" "+ox.getUser().getId()+" *** ");
            for (Orderdetail od:ox.getOrderdetailList()
                 ) {
                System.out.println(od.getItems_id()+" "+od.getItems_num()+" ");
            }
        }
        sqlSession.close();
    }

    @Test
    public void testMoreToMore() throws IOException {
        SqlSession sqlSession = getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<User> user = orderMapper.getUserByAll();
        sqlSession.close();
    }
}
