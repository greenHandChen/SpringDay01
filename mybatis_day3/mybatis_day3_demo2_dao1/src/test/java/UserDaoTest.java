import com.dao.IUserDao;
import com.dao.UserDaoImpl;
import com.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 16:04 2019/7/18
 * @Modified By:
 */
public class UserDaoTest {

    private IUserDao userDao;

    @Before
    public void beforeTest() throws IOException {
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        userDao=new UserDaoImpl(sqlSessionFactory);
    }

    @Test
    public void testFindUserById() throws IOException {
//        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
//        IUserDao userDao=new UserDaoImpl(sqlSessionFactory);
        System.out.println(userDao.findUserById(10));
    }

    @Test
    public void testFindUsersByName() throws IOException {
        System.out.println(userDao.findUsersByName("张"));
    }
    @Test
    public void testInsertUser() throws IOException, ParseException {
        User user=new User();
        user.setUsername("MyBatis_insert");
        user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1997-09-02"));
        user.setSex("男");
        user.setAddress("芜湖");
        user.setManage_id(null);
        if(userDao.insertUser(user)){
            System.out.println("插入成功:"+user);
        }else{
            System.out.println("插入失败:"+user);
        }
    }




}
