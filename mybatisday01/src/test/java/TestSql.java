import com.st.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

public class TestSql {
    /**
     * 通过id查询
     *
     * @throws IOException
     */
    @org.junit.Test
    public void test01() throws IOException{
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.selectUserById", 1);
        System.out.println(user.getUsername());
        sqlSession.close();

    }
    /**
     * 模糊查询
     * @throws IOException
     */
    @Test
    public void test02() throws  IOException{
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> user = sqlSession.selectList("test.selectUserByUserName","'%明%'");
        System.out.println(user);
        sqlSession.close();
    }
    /**
     *添加信息
     * @throws IOException
     * @throws ParseException
     */
    @Test
    public void test03() throws  IOException, ParseException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("王二小");
        user.setBirthday( new SimpleDateFormat("yyyy-MM-dd").parse("1930-03-23"));
        user.setAddress("北京市朝阳区");
        user.setSex(1);
        int val =sqlSession.insert("test.addUser",user);
        System.out.println(val);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 添加用户返回自增主键
     * @throws IOException
     * @throws ParseException
     */
    @Test
    public void  test04() throws IOException,ParseException{
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("蔡徐坤");
        user.setBirthday( new SimpleDateFormat("yyyy-MM-dd").parse("1995-03-23"));
        user.setAddress("泰国");
        user.setSex(2);
        sqlSession.insert("test.addUserGetId",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 添加用户返回UUID
     * @throws IOException
     * @throws ParseException
     */
    @Test
    public void test05() throws IOException,ParseException{
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setId( Integer.valueOf(UUID.randomUUID().toString().replace("-","").substring(1).hashCode()));
        user.setUsername("谢广坤");
        user.setBirthday( new SimpleDateFormat("yyyy-MM-dd").parse("1986-03-23"));
        user.setAddress("乡村爱情");
        user.setSex(1);
        sqlSession.insert("test.addUserGetUUID",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }
}
