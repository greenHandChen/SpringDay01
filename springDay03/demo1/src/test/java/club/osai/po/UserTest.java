package club.osai.po;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserTest {
    @Test
    public void findUserById() {
        //读取配置文件
        InputStream is = null;

        try {
            is = Resources.getResourceAsStream("config/mybatis-config.xml");
            //初始化mybatis，创建SqlSessionFactory类实例
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            //创建Session实例
            SqlSession session = sqlSessionFactory.openSession();
            User user = session.selectOne("club.osai.mapper.UserMapper.findUserById", 1L);
            User user1 = session.selectOne("club.osai.mapper.UserMapper.findUserById", 1L);
            System.out.println(user);
            System.out.println(user1);
            session.close();

        } catch (IOException e) {
            e.printStackTrace();

        }


    }

    @Test
    public void findUserByUsername() {
        //读取配置文件
        InputStream is = null;

        try {
            is = Resources.getResourceAsStream("config/mybatis-config.xml");
            //初始化mybatis，创建SqlSessionFactory类实例
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            //创建Session实例
            SqlSession session = sqlSessionFactory.openSession();
            List<User> users = session.selectList("club.osai.mapper.UserMapper.findUserByUsername", "'%明%' OR 1=1");
//            User user = session.selectOne("club.osai.po.User.findUserByUsername", "'%明%'");
            System.out.println(users);
            session.close();

        } catch (IOException e) {
            e.printStackTrace();

        }


    }

    @Test
    public void addUser() {
        //读取配置文件
        InputStream is = null;

        try {
            is = Resources.getResourceAsStream("config/mybatis-config.xml");
            //初始化mybatis，创建SqlSessionFactory类实例
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            //创建Session实例
            SqlSession session = sqlSessionFactory.openSession();
            User user = new User();
            user.setSex(1);
            user.setAddress("上海汉得");
            user.setBirthday(new Date());
            user.setUsername("陈权");
            int insert = session.insert("club.osai.mapper.UserMapper.addUser", user);
            if (insert > 0) {
                System.out.println("插入成功");
            }
            session.commit();

            session.close();

        } catch (IOException e) {
            e.printStackTrace();

        }


    }

    @Test
    public void addUserGetId() {
        //读取配置文件
        InputStream is = null;

        try {
            is = Resources.getResourceAsStream("config/mybatis-config.xml");
            //初始化mybatis，创建SqlSessionFactory类实例
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            //创建Session实例
            SqlSession session = sqlSessionFactory.openSession();
            User user = new User();
            user.setSex(1);
            user.setAddress("上海汉得");
            user.setBirthday(new Date());
            user.setUsername("陈权11");
            int insert = session.insert("club.osai.mapper.UserMapper.addUserGetId", user);
            if (insert > 0) {
                System.out.println("插入成功");
            }
            session.commit();

            session.close();

        } catch (IOException e) {
            e.printStackTrace();

        }


    }

    @Test
    public void addUserGetUUID() {
        //读取配置文件
        InputStream is = null;

        try {
            is = Resources.getResourceAsStream("config/mybatis-config.xml");
            //初始化mybatis，创建SqlSessionFactory类实例
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            //创建Session实例
            SqlSession session = sqlSessionFactory.openSession();
            User user = new User();
            user.setSex(1);
            user.setAddress("上海汉得");
            user.setBirthday(new Date());
            user.setUsername("陈权11");
            int insert = session.insert("club.osai.mapper.UserMapper.addUserGetUUID", user);
            if (insert > 0) {
                System.out.println("插入成功");
            }
            session.commit();

            session.close();

        } catch (IOException e) {
            e.printStackTrace();

        }


    }

}