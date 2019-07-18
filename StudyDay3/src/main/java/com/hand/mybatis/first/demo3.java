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
 * @Date 2019/7/18 15:19
 * @Version 1.0
 */

public class demo3 {
    @Test
    public void Test3() throws Exception {
        //读取配置文件
        String resource = "config/SqlMapConfig.xml";//这里可以找到这个文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //删除用户
        sqlSession.delete("test.deleteUser", 27);

        //提交事务
        sqlSession.commit();

        //关闭资源
        sqlSession.close();
    }
}
