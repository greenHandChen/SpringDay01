package com.mybatis.demo.storeMain;

import com.mybatis.demo.storeDto.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class InsertUpdateDelUser {

    /**
     *
     * @return
     * @throws IOException
     * 公用方法，创建SqlSessionFactory
     * 并openSqlSession
     */
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
    public void insertUser() throws IOException {
        SqlSession sqlSession = getSqlSession();
        User user = new User();
        user.setUsername("杨永信");
        user.setSex("男");
        user.setAddress("北京");
       int val = sqlSession.insert("test.inertIntoUser",user);
       System.out.println(val);
       sqlSession.commit();
       sqlSession.close();
    }

    @Test
    public void insertGetId() throws IOException{

        SqlSession sqlSession = getSqlSession();
        User user = new User();
        user.setUsername("梁非凡");
        user.setSex("男");
        user.setAddress("广东");
        sqlSession.insert("test.insertGetId",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateUser() throws IOException{   //更改 表数据
        SqlSession sqlSession = getSqlSession();
        int var_ = sqlSession.update("test.updateUser",32);
        System.out.println(var_);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delUserInfo() throws IOException{  //删除表数据
        SqlSession sqlSession = getSqlSession();
        int flag = sqlSession.delete("test.delUserInfo",32);
        System.out.println(flag);
        sqlSession.commit();
        sqlSession.close();
    }


}
