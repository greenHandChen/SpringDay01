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
 * @Date 2019/7/18 14:41
 * @Version 1.0
 */

public class demo2 {
    @Test
    public void Test2() throws Exception {
        //读取配置文件
        String resource = "config/SqlMapConfig.xml";//这里可以找到这个文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("熊依琳666");
        user.setAddress("深圳6666");

        //插入新用户
        sqlSession.insert("test.insertUser", user);
        //获取主键的值
        System.out.println(user.getId());
        //提交事务
        sqlSession.commit();

        //关闭资源
        sqlSession.close();
    }
}
