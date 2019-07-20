//import daoMapper.UserDaoImpl;
import daoMapper.UserDaoImpl;
import daoMapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class TestSpringMybatis {

//    private SqlSessionFactory sqlSessionFactory;
//
//    @Before
//    public void init()throws IOException {
//        InputStream inputStream= Resources.getResourceAsStream("config/SqlMapConfig.xml");
//        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//    }


    /**
     * @Description  mapper代理开发模式
     * @Author  ChenWeixong
     * @Date   2019/7/19 18:57
     * @Param
     * @Return
     * @Exception
     * */

    @Test
    public void t1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/applicationContext.xml");

        UserMapper mapper = (UserMapper) applicationContext.getBean("userMapper");

        System.out.println(mapper.findUserById(10));


    }


    /**
     * @Description 原始dao模式开发
     * @Author  ChenWeixong
     * @Date   2019/7/19 18:58
     * @Param
     * @Return
     * @Exception
     * */
    @Test
    public void t2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/applicationContext.xml");

        UserDaoImpl userDao=(UserDaoImpl)applicationContext.getBean("useDao");

        System.out.println(userDao.findUserById(10));
    }

}
