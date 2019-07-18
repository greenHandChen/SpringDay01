package org.hgh.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.hgh.dao.mapper.UserTrendMapper;
import org.hgh.vo.UserVO;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatisOfTrend {
    InputStream inputStream = Resources.getResourceAsStream("sqlmapconfig.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    public TestMybatisOfTrend() throws IOException {
    }

    @Test
    public void test01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserTrendMapper userTrendMapper = sqlSession.getMapper(UserTrendMapper.class);
        UserVO userVO = new UserVO("张",null,null,null);
        userVO.setId(1);
        System.out.println(userTrendMapper.testIfAndWhereLabel(userVO));
        sqlSession.close();
    }
}
