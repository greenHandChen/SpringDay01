import damain.User;
import damain.UserQueryVO;
import mapper.UserMapper;
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

public class test2 {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        this.sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void testA()
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO=new UserQueryVO();
        User user=new User();
        user.setAddress("河南");
        user.setSex(1);
        userQueryVO.setUser(user);
        List<User> list=mapper.findUserByUser(userQueryVO);
        for (User u :list)
            System.out.println(u);
        sqlSession.close();

    }
    @Test
    public void testMap(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Map<String,String> map =new HashMap<String,String>();
        map.put("username","小");
        System.out.println(mapper.findUserByMap(map));
        sqlSession.close();

    }
    @Test
    public void testCount(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.countUser());
        sqlSession.close();
    }
    @Test
    public  void  testB(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserNameAndAddressById(29));
        sqlSession.close();
    }
    @Test
    public void testResultMap(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.testResultMap(29));
        sqlSession.close();
    }
    @Test
    public void testLabel()
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setUsername("小");
        System.out.println(mapper.testIfAndWhereLabel(user));
        sqlSession.close();
    }


}
