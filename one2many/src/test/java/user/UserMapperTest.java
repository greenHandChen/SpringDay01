package user;

import com.hand.entity.User;
import com.hand.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by HuangHeng on 2019/7/19
 */
public class UserMapperTest {
    private SqlSession sqlSession =null;

    @Before
    public void before() throws IOException {
        String resource = "mybatisConfig.xml";
        InputStream inputStream
                = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession= sqlSessionFactory.openSession();
    }
    @Test
    public void findUserById(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println("user-------->"+user);
    }
}
