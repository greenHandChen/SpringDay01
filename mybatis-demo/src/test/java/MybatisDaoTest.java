import com.yonye.mybatis.dao.UserDaoImpl;
import com.yonye.mybatis.mapper.LazyLoadRstMappper;
import com.yonye.mybatis.mapper.UsersMapper;
import com.yonye.mybatis.pojo.User;
import com.yonye.mybatis.vo.OrdersExt;
import com.yonye.mybatis.vo.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:Yonye
 * @Date:2019/7/18 10:58
 * @Version:1.0
 * @deseription:
 **/
public class MybatisDaoTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init()throws IOException{
        //1、读取全局配置文件
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void testDao(){
        UserDaoImpl userDao=new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        //根据Id查询
        System.out.println(userDao.findUserById(1));
        //根据用户名查询
        System.out.println(userDao.findUserByUserName("y"));

        //插入用户
        User user=new User();
        user.setUsername("夏侯瑾轩");
        user.setAddress("夏候府");
        System.out.println(userDao.addUser(user));

    }
    @Test
    public void testMapper(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 创建UserMapper对象,mybatis自动生成mapper代理对象
        UsersMapper userMapper = sqlSession.getMapper(UsersMapper.class);
        System.out.println(userMapper.findUserById(1));
        System.out.println();
    }

    @Test
    public void testA(){
        SqlSession sqlSession=sqlSessionFactory.openSession();

        UsersMapper usersMapper=sqlSession.getMapper(UsersMapper.class);
        UserQueryVo userQueryVo=new UserQueryVo();
        User user=new User();
        user.setAddress("号");
        user.setSex(0);
        userQueryVo.setUser(user);
        System.out.println(usersMapper.findUserByUser(userQueryVo));
        sqlSession.close();

    }

    @Test
    public void testMap(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UsersMapper usersMapper=sqlSession.getMapper(UsersMapper.class);
        Map<String,String> map=new HashMap<String, String>();
        map.put("username","j");
        System.out.println(usersMapper.findUserByMap(map));
        sqlSession.close();
    }

    @Test
    public void countTest(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UsersMapper usersMapper=sqlSession.getMapper(UsersMapper.class);
        System.out.println(usersMapper.countUser());
        sqlSession.close();
    }

    @Test
    public void resultMapTest(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UsersMapper usersMapper=sqlSession.getMapper(UsersMapper.class);
        System.out.println(usersMapper.resultMapTest(1));
        sqlSession.close();
    }

    @Test
    public void testLabel(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UsersMapper usersMapper=sqlSession.getMapper(UsersMapper.class);
        User user=new User();
        user.setUsername("j");
        System.out.println(usersMapper.testIfAndWhereLabel(user));
        sqlSession.close();
    }

    @Test
    public void testLoading(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        LazyLoadRstMappper lazyLoadRstMappper=sqlSession.getMapper(LazyLoadRstMappper.class);
        lazyLoadRstMappper.findOrderInfoByLazyLoad(1);
        lazyLoadRstMappper.findOrderInfoByLazyLoad(1);
        List<OrdersExt> ordersExts= lazyLoadRstMappper.findOrderInfoByLazyLoad(1);
        for (OrdersExt o:ordersExts){
            System.out.println(o);
        }

        sqlSession.close();
    }



}
