package mhybatis_test;

import com.alibaba.druid.sql.builder.SQLBuilderFactory;
import mybatis.enity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @Description: xml映射文件
 * @Author: TanLinQuan
 * @Date: 2019/7/18 14:19
 * @Version: V1.0
 **/
public class MybatisXml {

    private static SqlSession sqlSession = null;

    @Before
    public void setUp() throws IOException {
        String resouce = "Mybatis_Config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @After
    public void destory() {
        sqlSession.close();
    }

    @Test
    public void XmlTest() {
//        User user = sqlSession.selectOne("dao.findUserById", 1);
//        List<User> user = sqlSession.selectList("findByUserUserName", "张");
//        User user = new User();
//        user.setUsername("汉得");
//        user.setAddress("上海");
//        int row = sqlSession.insert("addUser", user);
//        if (row == 1) {
//            System.out.println("插入成功");
//        } else {
//            System.out.println("插入失败");
//        }
//        sqlSession.commit();

//        User user = new User();
//        user.setUsername("工信");
//        user.setAddress("安徽");
//        int row = sqlSession.insert("addUserGetId", user);
//        if (row == 1) {
//            System.out.println("插入成功");
//        } else {
//            System.out.println("插入失败");
//        }
//        sqlSession.commit();

//        User user = new User();
//        user.setUsername("工信大");
//        user.setAddress("安徽");
//        int row = sqlSession.insert("addUserGetUUID", user);
//        if (row == 1) {
//            System.out.println("插入成功");
//        } else {
//            System.out.println("插入失败");
//        }
//        sqlSession.commit();


    }
}
