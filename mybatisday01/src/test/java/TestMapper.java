import com.st.Mapper.UserMapper;
import com.st.domain.User;
import com.st.domain.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TestMapper {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    /**
     * 测试mappr代理
     */
    @Test
    public void testMapper() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.selectUserById(25));
        sqlSession.close();
    }

    /**
     * 输入映射：包装pojo类型
     */
    @Test
    public void testMapperPojo() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO = new UserQueryVO();
        User user = new User();
        user.setAddress("郑州");
        user.setSex(1);
        userQueryVO.setUser(user);
        System.out.println(userMapper.findUserByUser(userQueryVO));
        sqlSession.close();
    }

    /**
     * 输入映射：map类型
     */
    @Test
    public void testMapperMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String,String> map = new HashMap<>();
        map.put("username","小明");
        System.out.println(userMapper.findUserByMap(map));
        sqlSession.close();
    }

    /**
     * 输出映射：简单类型
     */
    @Test
    public void testMapperResultType() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.countUser());
        sqlSession.close();
    }

    /**
     * 输出映射：pojo类型
     */
    @Test
    public void testMapperResultTypePojo() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findUsernameAndAddressByID(29));
        sqlSession.close();
    }

    /**
     * 输出映射：resultMap类型
     */
    @Test
    public void testMapperResultMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.resultMap(24));
        sqlSession.close();
    }

    /**
     * 动态sql（if、where）
     */
    @Test
    public void testLabel() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("徐");
        System.out.println(userMapper.testLabel(user));
        sqlSession.close();
    }
}
