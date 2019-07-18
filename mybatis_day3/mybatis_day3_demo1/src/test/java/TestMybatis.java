import com.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 11:28 2019/7/18
 * @Modified By:
 */
public class TestMybatis {
    @Test
    public void findUserById() throws IOException {
        //读取配置文件
        String resource="SqlMapConfig.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);

        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

        //创建SqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();

        //调研SqlSession的增删改方法
        User user = sqlSession.selectOne("test.selectUserById",24);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void findUsersByName() throws IOException {
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));

        SqlSession sqlSession=sqlSessionFactory.openSession();

        List<User> userList=sqlSession.selectList("test.selectUsersByName","张%");

        System.out.println(userList);
        sqlSession.close();
    }

    @Test
    public void findUsersByName2() throws IOException {
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));

        SqlSession sqlSession=sqlSessionFactory.openSession();

        //使用${}占位符，这里演示sql注入
        List<User> userList=sqlSession.selectList("test.selectUsersByName2","'张%' or 1=1");

        System.out.println(userList);
        sqlSession.close();
    }

    @Test
    public void insertUser() throws IOException, ParseException {
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));

        SqlSession sqlSession=sqlSessionFactory.openSession();

        User user=new User();
        user.setUsername("MyBatis_insert");
        user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1997-09-02"));
        user.setSex("男");
        user.setAddress("芜湖");
        user.setManage_id(null);

        int n = sqlSession.insert("test.addUser",user);
        if(n>=1){
            System.out.println("插入成功:"+user);
        }else{
            System.out.println("插入失败");
        }

        //需要手动commit,否则不会加入成功
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void insertUser2() throws IOException, ParseException {
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));

        SqlSession sqlSession=sqlSessionFactory.openSession();

        User user=new User();
        user.setUsername("MyBatis_insert");
        user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1997-09-02"));
        user.setSex("男");
        user.setAddress("芜湖");
        user.setManage_id(null);

        int n = sqlSession.insert("test.addUser2",user);
        if(n>=1){
            System.out.println("插入成功:"+user);
        }else{
            System.out.println("插入失败:"+user);
        }

        //需要手动commit,否则不会加入成功
        sqlSession.commit();
        sqlSession.close();
    }
}
