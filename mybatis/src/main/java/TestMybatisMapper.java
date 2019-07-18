import Dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
//使用接口与映射文件的方式
public class TestMybatisMapper {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init()throws IOException{
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);


    }

    @Test
    public void testDao(){

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserById("27"));
        sqlSession.close();
    }

}

