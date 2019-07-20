package com.hand;

import com.hand.Entity.User;
import com.hand.Mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    // 使用dao测试
    @Test
    public void test() throws IOException {

        // 1. 读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 2. 创建AqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3. 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4. 具体sql操作

        // （1）. 根据用户ID来查询用户信息
        User user = sqlSession.selectOne("UserMapper.selectUserById", 10);

        user.getAllInfo();

        // （2）. 根据用户名称来模糊查询用户信息列表
        List<User> userList = sqlSession.selectList("UserMapper.selectUserByName", "%明%");

        System.out.println(userList);

        // （3）. 添加用户
        User user2 = new User("蟹老板", 1 , "芜湖");

        sqlSession.insert("UserMapper.insertUser", user2);
        sqlSession.commit();


        // （4）. 删除用户
        sqlSession.delete("UserMapper.deleteUser", 38);
        sqlSession.commit();

        // （5）. 修改用户
        sqlSession.update("UserMapper.updateUser", new User(40, "new name"));
        sqlSession.commit();

        // 5. 关闭sqlSession（释放连接）
        sqlSession.close();

    }

    // 使用mapper代理测试
    @Test
    public void testMapper() throws IOException {

        // 1. 读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 2. 创建AqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3. 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.selectUserByIdA(10).getAllInfo();

    }
}
