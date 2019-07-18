import com.masirhh.mybatis.beans.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class test {
    //1.读取全局配置文件
    InputStream is;

    {
        try {
            is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //2.创建SSqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    //3.读取Sqlsession
    SqlSession sqlSession = sqlSessionFactory.openSession();

    //简单查询
    @Test
    public void test1() throws IOException {

        //4.执行查询      第一个参数是命名空间 参加mapper里面的命名空间 第二个参数是传入类型
        User user = sqlSession.selectOne("test.findUserById", 10);
        System.out.println(user);
        //5.关闭Sqlsession
        sqlSession.close();
    }

    //     模糊查询
    @Test
    public void test2() {
        //4.执行查询      第一个参数是命名空间 参加mapper里面的命名空间 第二个参数是传入类型
        List<User> user = sqlSession.selectList("test.findUserByUsername", "'%明%' or id=10");
        System.out.println(user);
        //5.关闭Sqlsession
        sqlSession.close();
    }

    //插入用户
    @Test
    public void test3() {
        User user = new User();
        user.setUsername("MYBATIS");
        user.setSex(1);
        user.setAddress("CHN");
        user.setBirthday(new Date());
        sqlSession.insert("test.insertUser", user);
//        插入的时候记得提交
        sqlSession.commit();
        sqlSession.close();

    }

    //    添加用户返回自增主键
    @Test
    public void test4() {
        User user = new User();
        user.setUsername("MYBATIS2");
        user.setSex(1);
        user.setAddress("CHN");
        user.setBirthday(new Date());
        sqlSession.insert("test.addUserGetId", user);
        System.out.println("INDEX : " + user.getId());
//        插入的时候记得提交
        sqlSession.commit();
        sqlSession.close();
    }

}
