package zbh.hand;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zbh.hand.pojo.User;

import java.util.List;

/**
 * @author: wuhui
 * @time: 2019/7/18 10:03
 * @desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class MyTest {
    @Autowired
    SqlSessionFactory sqlSessionFactory;
    @Test
    public void test0(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("zbh.hand.mappers.selectUserById", 1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void test1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("zbh.hand.mappers.selectUserByUsername", "小");
        System.out.println(users.size());
        users.stream().forEach(e->System.out.println(e.toString()));
        sqlSession.close();

    }
    @Test
    public void test3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("zbh");
        sqlSession.insert("zbh.hand.mappers.addUser",user);
        System.out.println("done");
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();

    }
}
