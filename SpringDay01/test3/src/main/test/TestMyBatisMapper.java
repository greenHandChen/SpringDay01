import common.UserQueryVO;
import domain.User;
import mapper.UserMapper;
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

public class TestMyBatisMapper {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder() .build(is);
    }

@Test
public void testDao(){
    SqlSession sqlSession=sqlSessionFactory.openSession();
    UserMapper mapper=sqlSession.getMapper(UserMapper.class);
    System.out.print(mapper.findById(28));
    sqlSession.close();
}
    @Test
    public void testA() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO=new UserQueryVO();
        User user=new User();
        user.setAddress("江夏");
        user.setSex(2);
        userQueryVO.setUser(user);
        User byUser = mapper.findByUser(userQueryVO);
        System.out.print(byUser);
        sqlSession.close();
    }
    @Test
    public void testMap() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,String> map=new HashMap<>();
        map.put("username","胡丽娟");
        System.out.print(mapper.findUserByMap(map));
        sqlSession.close();
    }
    @Test
    public void testCount() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int count=mapper.countUser();
        System.out.print(count);
        sqlSession.close();
    }

    @Test
    public void testpojo() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=mapper.findUserNameANDaddress(28);
        System.out.print(user);
        sqlSession.close();
    }
    @Test
    public void testResultMap() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.print(mapper.testResultMap(28));
        sqlSession.close();
    }

    @Test
    public void testLable() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setUserName("小");
        user.setId(30);
        user.setSex(2);
        user.setAddress("江夏");
        /*user.setBirthday();*/
        System.out.print(mapper.testIfAndWhereLable(user));
        sqlSession.close();
    }
}