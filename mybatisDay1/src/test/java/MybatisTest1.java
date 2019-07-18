import com.hand.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MybatisTest1 {
    InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
    SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
    SqlSession sqlSession=sf.openSession();
    public MybatisTest1() throws IOException {
    }


    @Test
    public void demo1() {
        User user=sqlSession.selectOne("com.hand.mapper.UserMapper.findUserById",1);
        System.out.println(user.toString());
        List<User> list = sqlSession.selectList("com.hand.mapper.UserMapper.findUserByUsername", "'ff' or 1=1");
        for (User users:list
             ) {
            System.out.println(users);
        }
        sqlSession.close();

    }
    @Test
    public void demo2() {
        User user=new User();
        user.setId(12);
        user.setAddress("安徽芜湖");
        user.setUsername("CXK");
        user.setSex(1);
        int i = sqlSession.insert("com.hand.mapper.UserMapper.insertInfo", user);
        System.out.println("sda");
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();

    }

    /**
     * @Author suny
     * 查询自增主键
     */
    @Test
    public void demo3() {
        User user=new User();
        user.setAddress("南京安徽");
        user.setUsername("雷姆");
        user.setSex(1);
        sqlSession.insert("com.hand.mapper.UserMapper.insertInfoGetKey", user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();

    }
}
