import com.hand.dao.UserDao;
import com.hand.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDaoTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    }

    @Test
    public void testGetUserByUser(){
        UserDao userDao = new UserDao();
        userDao.setSqlSessionFactory(sqlSessionFactory);

        User user = new User();
        user.setSex(1);
        user.setAddress("河南");
        List<User> userList = userDao.getUserByUser(user);

        for(User u:userList) System.out.println(u);
    }

}
