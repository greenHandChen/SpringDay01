import com.hand.bean.User;
import com.hand.bean.UserQueryVO;
import com.hand.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MapperTest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);

    }

    /**
     * mapper测试
     */
    @Test
    public void TestMapper(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserById(12));
        System.out.println(mapper.findUserByUsername("'张三'"));
        User user=new User();
        user.setUsername("王二");
        user.setAddress("北京");
        System.out.println((mapper.insertInfo(user)>0));
        sqlSession.close();
    }

    /**
     * pojo测试
     */
    @Test
    public void TestPOJO(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO=new UserQueryVO();
        User user=new User();
        user.setAddress("河南");
        user.setSex(1);
        userQueryVO.setUser(user);
        System.out.println(userQueryVO.getUser().toString());
        List<User> userByUser = mapper.findUserByUser(userQueryVO);
        for (User users:userByUser
             ) {
            System.out.println(users);
        }

        sqlSession.close();
    }

    /**
     * map测试
     */
    @Test
    public void testResultMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserMap(1));
        sqlSession.close();
    }
}
