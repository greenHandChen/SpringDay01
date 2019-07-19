import com.yonye.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class XMLSqlTest {


    @Test
    public void demo01()throws IOException {
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("test.findUserById",1);
        System.out.println(user.toString());
        sqlSession.close();
    }

    @Test
    public void demo02()throws IOException {
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("test.findUserByUserName","'%yy%'");
        System.out.println(user.toString());
        sqlSession.close();
    }

    @Test
    public void demo03()throws IOException {
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setUsername("jack");
        user.setAddress("水浸街77号");
        int i=sqlSession.insert("test.addUser",user);
        if ( i>0){
            System.out.println(i+" 条数据写入成功！！");
        }else{
            System.out.println("写入失败！");
        }
        //写入数据需要手动提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void demo04()throws IOException {
        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=new User();
        user.setUsername("jack");
        user.setAddress("水浸街77号");
        int i=sqlSession.insert("test.addUserGetId",user);
        if ( i>0){
            System.out.println(i+" 条数据写入成功！！");
            System.out.println(user.getId());
        }else{
            System.out.println("写入失败！");
        }
        //写入数据需要手动提交事务
        sqlSession.commit();

        sqlSession.close();
    }

//    @Test
//    public void demo05()throws IOException {
//        InputStream is= Resources.getResourceAsStream("SqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession=sqlSessionFactory.openSession();
//        User user=new User();
//        user.setUsername("jack");
//        user.setAddress("水浸街77号");
//        int i=sqlSession.insert("test.addUserGetUUID",user);
//        if ( i>0){
//            System.out.println(i+" 条数据写入成功！！");
//            System.out.println(user.getId());
//        }else{
//            System.out.println("写入失败！");
//        }
//        //写入数据需要手动提交事务
//        sqlSession.commit();
//
//        sqlSession.close();
//    }
}
