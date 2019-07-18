package org.hgh.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.hgh.dao.mapper.UserMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatisMapperProxy {
    InputStream inputStream = Resources.getResourceAsStream("sqlmapconfig.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    public TestMybatisMapperProxy() throws IOException {
    }

    @Test
    public void test01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUsernameAndAddressById(1));
        sqlSession.close();
    }

    
}
