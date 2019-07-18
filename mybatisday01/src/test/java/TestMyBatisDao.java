import com.st.BeforeDao.UserDaoImpl;
import com.st.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestMyBatisDao {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
         sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testDao() throws ParseException {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        System.out.println(userDao.findUserById(27));
        System.out.println(userDao.findUserByName("'%坤'"));
        User user = new User();
        user.setUsername("王霸天");
        user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1956-04-25"));
        user.setSex(0);
        user.setAddress("天辰大陆");
        userDao.addUser(user);
    }
}
