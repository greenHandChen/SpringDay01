import com.dao.IUserDao;
import com.dao.UserDaoImpl;
import com.domain.User;
import com.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
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
public class UserMapperTest {

    private UserMapper userMapper;

    @Before
    public void beforeTest() throws IOException {
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession sqlSession=sqlSessionFactory.openSession();
        userMapper=sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void testFindUserById() throws IOException {
//        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
//        IUserDao userDao=new UserDaoImpl(sqlSessionFactory);
        System.out.println(userMapper.selectUserById(10));
    }

    @Test
    public void testFindUsersByName() throws IOException {
        System.out.println(userMapper.selectUsersByName("张"));
    }
    @Test
    public void testInsertUser() throws IOException, ParseException {
        User user=new User();
        user.setUsername("MyBatis_insert");
        user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1997-09-02"));
        user.setSex("男");
        user.setAddress("芜湖");
        user.setManage_id(null);
        if(userMapper.addUser(user)>=1){
            System.out.println("插入成功:"+user);
        }else{
            System.out.println("插入失败:"+user);
        }
    }




}
