import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatisMapper {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        this.sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void testDao()
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserById(29));
        sqlSession.close();
    }
}
