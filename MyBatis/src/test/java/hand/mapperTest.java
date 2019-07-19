package hand;

import Entity.User;
import Entity.UserQueryVO;
import Mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void demo1(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserId(1));
        System.out.println(mapper.findUserByUsername("小明"));
        User user = new User();
        user.setUsername("test");
        user.setAddress("test");
        System.out.println(mapper.addUser(user));
        sqlSession.close();
    }

    @Test
    public void demo2(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO = new UserQueryVO();
        User user = new User();
        user.setAddress("河南");
        user.setSex(1);
        userQueryVO.setUser(user);
        System.out.println(mapper.findUserList(userQueryVO));
        sqlSession.close();
    }

    @Test
    public void demo3(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map = new HashMap();
        map.put("username","小明");
        map.put("address","河南");
        System.out.println(mapper.findUserByMap(map));
        sqlSession.close();
    }

    @Test
    public void demo4(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.countUser());
        sqlSession.close();
    }

    @Test
    public void demo5(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUsernameAndAddressById(1));
        sqlSession.close();
    }

    @Test
    public void demo6(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserRstMap(10));
        sqlSession.close();
    }

    @Test
    public void demo7(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("小");
        System.out.println(mapper.testIfAndWhereLabel(user));
        sqlSession.close();
    }

    @Test
    public void demo8(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List list = new ArrayList();
        list.add(1);
        list.add(10);
        System.out.println(mapper.testForEach(list));
        sqlSession.close();
    }

    @Test
    public void demo9(){

    }
}
