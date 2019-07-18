import com.zt.mybatis.domain.UserQueryVO;
import com.zt.mybatis.mapper.UserMapper;
import com.zt.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: mybatis基于dao的Mapper代理的开发方式测试
 * @author: invokerZt
 * @date: 2019-07-18 11:29
 */
public class TestDaoMapper {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        /**
         * @description: 初始化sqlSessionFactory
         * @author: invokerZt
         * @date: 2019-07-18 11:31
         * @param :
         * @return: void
         */
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void test_01() {
        /**
         * @description: 根据id查询用户
         * @author: invokerZt
         * @date: 2019-07-18 11:50
         * @param :
         * @return: void
         */
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(28);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void test_02() {
        /**
         * @description: POJO类查询
         * @author: invokerZt
         * @date: 2019-07-18 15:28
         * @param :
         * @return: void
         */
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setAddress("河南");
        user.setSex(1);
        UserQueryVO userQueryVO = new UserQueryVO();
        userQueryVO.setUser(user);
        List<User> users = userMapper.findUserByUser(userQueryVO);
        sqlSession.close();
        System.out.println(users);
    }

    @Test
    public void test_03() {
        /**
         * @description: 输入映射Map，输出映射resultMap
         * @author: invokerZt
         * @date: 2019-07-18 15:42
         * @param :
         * @return: void
         */
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", "小");
        List<User> users = userMapper.findUserByMap(map);
        sqlSession.close();
        System.out.println(users);
    }

    @Test
    public void test_04() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("小");
        System.out.println(user);
        List<User> users = userMapper.findUserByIfAndWhereLabel(user);
        sqlSession.close();
        System.out.println(users);
    }
}
