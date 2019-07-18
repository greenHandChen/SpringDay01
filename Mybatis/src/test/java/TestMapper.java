import com.hand.POJO.UserQueryVO;
import com.hand.entity.User;
import com.hand.mapper.UserMapper;
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

public class TestMapper {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException{
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void demo1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserById(27));
        sqlSession.close();
    }

    @Test
    public void demo2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setAddress("北京市");
        user.setSex(1);
        UserQueryVO userQueryVO = new UserQueryVO();
        userQueryVO.setUser(user);
        List<User> list = mapper.findUserByUser(userQueryVO);
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i).getUsername());
        }
        sqlSession.close();
    }

    @Test
    public void demo3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,String> map = new HashMap<String, String>();
        map.put("username","汉得广州中心");
        List<User> list = mapper.findUserByMap(map);
        for (User user:list) {
            System.out.println(user.getAddress());
        }
    }
}
