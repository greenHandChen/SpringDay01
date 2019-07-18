import com.jqh.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

/**
 * @Auther: 几米
 * @Date: 2019/7/18 09:38
 * @Description: TestMybatis
 */
public class TestMybatis {
    @Test
    public void testSelect() throws Exception {
        SqlSession sqlSession=getSession();
        User user = sqlSession.selectOne("com.jqh.mapper.findUserById",1);
        System.out.println(user);
        sqlSession.close();
    }
@Test
    public void testInsert()throws Exception{
        SqlSession sqlSession=getSession();
    int insert = sqlSession.insert("com.jqh.mapper.addUser", new User("不悔", new Date(), 1, "大连"));
    System.out.println(insert);
    sqlSession.commit();
    sqlSession.close();
    }

    public SqlSession getSession() throws Exception{
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession sqlSession = factory.openSession();
        return sqlSession;
    }
}
