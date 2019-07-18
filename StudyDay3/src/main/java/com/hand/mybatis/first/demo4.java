package com.hand.mybatis.first;

import com.hand.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * @Author xiongyilin
 * @Date 2019/7/18 15:29
 * @Version 1.0?
 */

public class demo4 {
    @Test
    public void Test4() throws Exception {
        //读取配置文件
        String resource = "config/SqlMapConfig.xml";//这里可以找到这个文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("小吴");
        user.setAddress("深圳");

        //修改用户
        sqlSession.update("test.updateUser",1);


        //提交事务
        sqlSession.commit();

        //关闭资源
        sqlSession.close();
    }
}
