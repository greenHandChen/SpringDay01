package com.lhb;

import com.lhb.domain.User;
import com.lhb.domain.UserQueryVO;
import com.lhb.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By LHB on 2019/7/18;
 */
public class Test_mybatis {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testA(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO=new UserQueryVO();
        User user =new User();
        user.setAddress("上海");
        user.setSex(2);
        userQueryVO.setUser(user);
        System.out.println(mapper.findUserByUser(userQueryVO));
        sqlSession.close();

    }


    @Test
    public void testMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,String> map=new HashMap<String, String>();
        map.put("username","小");
        System.out.println(mapper.findUserByMap(map));
        sqlSession.close();
    }


}
