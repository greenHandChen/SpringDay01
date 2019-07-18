package com.lzn.mybatis.dao;

import com.lzn.mybatis.entity.UserEntity;
import com.lzn.mybatis.pojo.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserQueryMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/SqlMapConfig.xml"));
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * @Description 测试pojo
     * @Param  * @param null
     * @Return 
     * @Author LinZhenNan
     * @Date 2019/7/18
     * @Time 20:02
     */
    @Test
    public void findUserByUser() {
        UserEntity user = new UserEntity();
        user.setSex(new Integer(1));
        user.setAddress("test");
        UserQueryVO userQueryVO = new UserQueryVO();
        userQueryVO.setUser(user);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserQueryMapper userQueryMapper = sqlSession.getMapper(UserQueryMapper.class);
        System.out.println(userQueryMapper.findUserByUser(userQueryVO));
        sqlSession.close();
        System.out.println("findUserByUser() end");
    }
}