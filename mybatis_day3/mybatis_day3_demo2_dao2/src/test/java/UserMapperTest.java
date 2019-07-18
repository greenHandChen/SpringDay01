import com.domain.User;
import com.mapper.UserMapper;
import com.po.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 16:04 2019/7/18
 * @Modified By:
 */
public class UserMapperTest {

    private UserMapper userMapper;
    private SqlSession sqlSession;

    @Before
    public void beforeTest() throws IOException {
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        sqlSession=sqlSessionFactory.openSession();
        userMapper=sqlSession.getMapper(UserMapper.class);
    }

    @After
    public void AfterTest(){
        sqlSession.close();
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

    @Test
    public void testFindUserListByAddressAndSex() throws IOException {
        User user = new User();
        user.setAddress("河南");
        user.setSex("1");
        UserQueryVO userQueryVO = new UserQueryVO();
        userQueryVO.setUser(user);
        System.out.println(userMapper.findUserListByAddressAndSex(userQueryVO));
    }

    @Test
    public void testFindUserByMap(){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("username","张%");
        System.out.println(userMapper.findUserByMap(map).size()+","+userMapper.findUserByMap(map));
    }

    @Test
    public void testSelectRows(){
        System.out.println(userMapper.selectRows());
    }

    @Test
    public void testSelectOrderByUserName(){
        List<Map<String,String>> resMap=userMapper.selectOrderByUserName("王五");
        System.out.println(resMap);
    }

    @Test
    public void testFindUserByCondition(){
        User user=new User();
        user.setAddress("河南");
        UserQueryVO userQueryVO=new UserQueryVO();
        userQueryVO.setUser(user);
        System.out.println(userMapper.findUserByCondition(userQueryVO));
    }

    @Test
    public void testSelectIdInCollection(){
        List<Integer> idList = new ArrayList<Integer>();
//        idList.add(1);
        UserQueryVO userQueryVO=new UserQueryVO();
        userQueryVO.setIdList(idList);
        System.out.println(userMapper.selectIdInCollection(userQueryVO));
    }
}
