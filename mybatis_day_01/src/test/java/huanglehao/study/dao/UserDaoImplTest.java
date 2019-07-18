package huanglehao.study.dao;

import huanglehao.study.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 14:41 2019/7/18
 */
public class UserDaoImplTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        //读取配置文件
        String resource="config/SqlMapConfig.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        //创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserById() throws  Exception{

        //创建UserDao
        UserDao dao=new UserDaoImpl(sqlSessionFactory);
       User user= dao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void findUsersByName() {
    }

    @Test
    public void insert() {
    }
}