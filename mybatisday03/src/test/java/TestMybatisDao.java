import com.mybatis.User;
import com.mybatis.UserDaoImpl;
import com.mybatis.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatisDao {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void testDao(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        //测试id查询
        System.out.println(userDao.findUserById(1));
        //测试用户查询
        System.out.println(userDao.findUserByUsername("王"));
        //测试插入
        User user = new User();
        user.setUsername("老王");
        user.setAddress("隔壁");
        System.out.println("插入了"+userDao.addUser(user)+"条记录");
    }
}
