import Dao.UserDaoImpl;
import Dao.UserMapper;
import Domin.User;
import Vo.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

//存在一定量的模板代码 存在一些硬编码
public class TestMyabtisDao {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

    }

    @Test
    public void testDao(){

        UserDaoImpl userDao =new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        System.out.println(userDao.findUserById("27"));
        System.out.println(userDao.findUserByUsername("汉"));

        User user = new User();
        user.setUsername("工信大");
        user.setAddress("安徽");
        System.out.println(userDao.addUser(user));
    }
//    测试包装pojo类
    @Test
    public void testA(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        UserQueryVo userQueryVo = new UserQueryVo();
        User user = new User();
        user.setAddress("河南");
        user.setSex(1);
        userQueryVo.setUser(user);
        System.out.println(mapper.findUserByUser(userQueryVo));
        sqlSession.close();
    }
    //测试Map
    @Test
    public void testMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,String> map = new HashMap<String, String>();
        map.put("username","小");
        System.out.println(mapper.findUserByMap(map));
        sqlSession.close();
    }

    @Test
    public void testLabel(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("小");
        System.out.println(mapper.testIfAndWhereLabel(user));
        sqlSession.close();
    }
}
