package com.hand.mybatis.first;


import com.hand.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author xiongyilin
 * @Date 2019/7/18 10:46
 * @Version 1.0
 *
 */

public class demo1 {
    @Test
    public void findUserByIdTest() throws Exception {
        //读取配置文件
        String resource = "config/SqlMapConfig.xml";//这里可以找到这个文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

        //创建SqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();

        //调用SqlSession的增删改查，第一个参数表示statement的唯一标识
        //精确查询，根据用户id查用户信息
        User user=sqlSession.selectOne("test.findUserByID",1);//这里出错了
        System.out.println(user);

        //模糊查询,根据用户名称查列表
        List<User> list=sqlSession.selectList("test.findUserByName","小明");
        System.out.println(list);

        //关闭资源
        sqlSession.close();
    }
}
