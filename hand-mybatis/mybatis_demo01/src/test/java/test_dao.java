import com.lhb.dao.UserDao;

import com.lhb.dao.impl.UserDaoImpl;
import com.lhb.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created By LHB on 2019/7/18;
 */
public class test_dao {


    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
         sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }



    @Test
    public void demo01() {
        UserDaoImpl userDao=new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);

        System.out.println(userDao.findUserById(30));

        System.out.println(userDao.findUserByUsername("汉"));

        System.out.println("----------------------------");
        User user=new User();
        user.setUsername("安信工");
        user.setAddress("芜湖");
        System.out.println(userDao.addUserGetId(user));

    }


}
