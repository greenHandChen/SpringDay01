package mybatis.dao.daoMapper;

import mybatis.enity.User;
import mybatis.vo.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    private static SqlSession sqlSession = null;

    @Before
    public void setUp() throws IOException {
        String resouce = "Mybatis_Config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @After
    public void destory() {
        sqlSession.close();
    }
    
    /**
    * @Description: typeAliases类型名修改测试以及MAPPER开发
    * @Author: TanLinQuan
    * @Date: 2019/7/18 16:47
    * @params: []
    * @return: void
    **/
    @Test
    public void MapperTest() {
//        根据ID查询用户
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        System.out.println(userMapper.findUserById(33));

//        根据VO模型查询用户
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        User user = new User();
//        UserQueryVO userQueryVO = new UserQueryVO();
//        user.setUsername("张三");
//        user.setAddress("北京市");
//        userQueryVO.setUser(user);
//        System.out.println(userMapper.findUserByUser(userQueryVO));

//        根据Map集合查询用户
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        HashMap<String,String> map = new HashMap<String, String>();
//        map.put("username","张");
//        System.out.println(userMapper.findUserByMap(map));

//        根据简单类型参数，返回POJO类型结果
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        System.out.println(userMapper.findUserNameAndAddressById(10));

//        返回类型为ResultMap
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        System.out.println(userMapper.testResultMap(10).getAddress());

//        动态Sql查询
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张");
        List<User> users = userMapper.testActiveSql(user);
        for (User user1 : users){
            System.out.println(user1.getUsername());
        }
    }
}