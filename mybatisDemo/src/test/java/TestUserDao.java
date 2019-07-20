
import daoMapper.UserMapper;
import domain.UserQueryVO;
import domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestUserDao {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init()throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

//    @Test
//    public void testDao(){
//        UserDaoImpl userDao=new UserDaoImpl();
//        userDao.setSqlSessionFactory(sqlSessionFactory);
//        System.out.println(userDao.findUserById(28));
//        System.out.println(userDao.findUserByUsername("汉"));
//    }
    @Test
    public void testA(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO=new UserQueryVO();
        User user=new User();
        user.setAddress("河南");
        user.setSex(2);
        userQueryVO.setUser(user);
        System.out.println(mapper.findUserByUser(userQueryVO));
        sqlSession.close();
    }
    @Test
    public void MapperTest() {
        SqlSession sqlSession=sqlSessionFactory.openSession();

//        根据VO模型查询用户
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        UserQueryVO userQueryVO = new UserQueryVO();
        user.setUsername("张三");
        user.setAddress("北京市");
        userQueryVO.setUser(user);
        System.out.println(userMapper.findUserByUser(userQueryVO));

//        根据简单类型参数，返回POJO类型结果
        System.out.println(userMapper.findUserNameAndAddressById(10));

//        返回类型为ResultMap
        System.out.println(userMapper.testResultMap(10).getAddress());

//        动态Sql查询
        user.setUsername("张");
        List<User> users = userMapper.testActiveSql(user);
        for (User user1 : users){
            System.out.println(user1.getUsername());
        }

    }




}
