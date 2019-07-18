import com.hand.mapper.UserMapper;
import com.hand.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {

    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("id",1);
        User user = mapper.getUserById(map);
        System.out.println(user);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("username","张");
        List<User> userList = mapper.getUserByUsername(map);
        for(User u : userList)
            System.out.println(u);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testAddUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        User user = new User();
        user.setUsername("孙八");
        user.setBirthday(new Date());
        user.setSex(1);
        user.setAddress("安徽信息工程学院");
        map.put("user", user);
        mapper.addUser(map);
        System.out.println("Has id："+user);

        sqlSession.commit();
        sqlSession.close();
    }

}
