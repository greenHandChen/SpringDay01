package com.hand.user;

import com.hand.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;


/**
 * Created by HuangHeng on 2019/7/18
 */
public class TestWeb1 {

    private SqlSession sqlSession =null;

    @Before
    public void before() throws IOException {
        String resource = "mybatisConfig.xml";
        InputStream inputStream
                = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession= sqlSessionFactory.openSession();
    }
    /**
     * @author:  HuangHeng
     * @description  根据用户id查询用户信息
     * @CreateDate:  2019/7/18
     */
    @Test
    public void findUserById() throws IOException {
        User user =null;
        try {
            user = (User)sqlSession.selectOne("findUserById", 10);
            System.out.println("findUserById----->"+user);
        }catch (Exception e){
            System.out.println("Fail---->"+e.getMessage());
        }finally {
            sqlSession.close();
        }
    }

    /**
     * @author:  HuangHeng
     * @description  查询所有用户信息
     * @CreateDate:  2019/7/18
     */
    @Test
    public void findAllUser() throws IOException {
        List<User> list =null;
        try {
            list = sqlSession.selectList("findAllUser");
            System.out.println("findAllUser----->"+list);
        }catch (Exception e){
            System.out.println("Fail---->"+e.getMessage());
        }finally {
            sqlSession.close();
        }
    }

    /**
     * @author:  HuangHeng
     * @description  根据 username 模糊查询
     * @CreateDate:  2019/7/18
     */
    @Test
    public void findUserByLikeUserName() throws IOException {
        List<User> list =null;
        try {
            list = sqlSession.selectList("findUserByLikeUserName","%张%");
            System.out.println("findUserByLikeUserName----->"+list);
        }catch (Exception e){
            System.out.println("Fail---->"+e.getMessage());
        }
    }
    /**
     * @author:  HuangHeng
     * @description  测试插入用户数据
     * @CreateDate:  2019/7/18
     */
    @Test
    public void insertUser() throws IOException {
        User user=new User();
        user.setSex("N");
        user.setAddress("湖北荆州");
        user.setUsername("HH");
        try {
            int insert = sqlSession.insert("insertUser",user);
            sqlSession.commit();
            System.out.println("insertUser----->"+insert);
        }catch (Exception e){
            System.out.println("Fail---->"+e.getMessage());
        }finally {
            sqlSession.close();
        }
    }
    /**
     * @author:  HuangHeng
     * @description  插入数据返回 主键id
     * @CreateDate:  2019/7/18
     */
    @Test
    public void returnId() throws IOException {
        User user=new User();
        user.setSex("N");
        user.setAddress("湖北荆州");
        user.setUsername("HH");
        try {
            sqlSession.insert("insertUserReturnId",user);
            sqlSession.commit();
            System.out.println("insertUserReturnId----->"+user.getId());
        }catch (Exception e){
            System.out.println("Fail---->"+e.getMessage());
        }finally {
            sqlSession.close();
        }
    }
}
