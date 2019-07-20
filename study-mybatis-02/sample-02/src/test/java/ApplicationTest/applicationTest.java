package ApplicationTest;

import Mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class applicationTest {

    @Test
    public void test() throws IOException {

        // 1. 读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 2. 创建AqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3. 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper( UserMapper.class);

        userMapper.findUserById(1).getAllInfo();

    }
}
