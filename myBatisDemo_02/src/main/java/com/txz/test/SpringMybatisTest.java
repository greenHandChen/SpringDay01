package com.txz.test;

import com.txz.domain.User;
import com.txz.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMybatisTest {

    private SqlSessionFactory sqlSessionFactory;
    private ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/applicationConfig.xml");
//    private UserDao userDao;

//    @Before
//    public void info() throws IOException {
//        InputStream is = Resources.getResourceAsStream("config/applicationConfig.xml");
//        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//    }





    @Test
    public void findUserById(){
        sqlSessionFactory = applicationContext.getBean(SqlSessionFactory.class);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(10);
        System.out.println(user.toString());
        sqlSession.close();
    }

    @Test
    public void findUserByIdDao(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.findUserById(10);
        System.out.println(userById.toString());
        sqlSession.close();

    }

}
