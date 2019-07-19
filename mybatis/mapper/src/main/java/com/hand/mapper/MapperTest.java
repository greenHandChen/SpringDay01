package com.hand.mapper;

import com.hand.VO.UserQueryVO;
import com.hand.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class MapperTest {
    @Test
    public void test() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        findUser1(mapper);
    }
    private void findUser1(UserMapper mapper){
        UserQueryVO uv=new UserQueryVO();
        User u=new User();
        u.setAddress("北京市");
        u.setSex("1");
        uv.setUser(u);
        User userByUser = mapper.findUserByUser(uv);
        System.out.println(userByUser);
    }
}
