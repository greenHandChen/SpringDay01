

import com.hand.mapper.UserMapper;
import com.hand.pojo.User;
import com.hand.pojo.UserQueryVO;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class MybatisTest {
    @Test
    public  void demo01() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();
        //映射 sql 的标识字符串
        //String statement = "com.hand.mapper.UserMapper"+".findUserById";
        //执行查询返回一个唯一 user 对象的 sql
        User user = session.selectOne("test.findUserById", 1);
        System.out.println(user);
        session.close();
    }

    @Test
    public  void demo02() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();
        //映射 sql 的标识字符串
        //String statement = "com.hand.mapper.UserMapper"+".findUserById";
        //执行查询返回一个唯一 user 对象的 sql
        //sql注入，因为user表中有3个以明结尾的名字，而它返回的是单个用户
        User user = session.selectOne("test.findUserByUsername", "'%明'"  );
        System.out.println(user);
        session.close();
    }

    @Test
    public  void demo03() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();
        //映射 sql 的标识字符串
        User user = new User();
        user.setAddress("上海");
        user.setUsername("汉得");
        int insert = session.insert("test.adduser", user);
        System.out.println(insert);
        session.commit();
        session.close();
    }

    @Test
    public  void demo04() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();
        //映射 sql 的标识字符串
        User user = new User();
        user.setAddress("安徽");
        user.setUsername("工信");
        session.insert("test.addUserGetId", user);
        System.out.println(user.getId());
        session.commit();
        session.close();
    }

    @Test
    public  void demo05() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();
        //映射 sql 的标识字符串
        User user = new User();
        user.setId(22);
        user.setAddress("安徽");
        user.setUsername("安大");
        session.insert("test.addUserGetId", user);
        System.out.println(user.getId());
        session.commit();
        session.close();
    }

    @Test
    public  void demo06() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();
        //映射 sql 的标识字符串
        User user = new User();
        user.setId(22);
        user.setAddress("芜湖方法");
        user.setUsername("安师得到大");
        session.insert("test.addUserGetUUID", user);
        System.out.println(user.getId());
        session.commit();
        session.close();
    }

    @Test
    public  void demo07() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        //映射 sql 的标识字符串
        UserQueryVO userQueryVO = new UserQueryVO();
        User user = new User();
        user.setSex(1);
        userQueryVO.setUser(user);
        System.out.println(userMapper.findUserByUser(userQueryVO));;
        session.close();
    }

    @Test
    public  void demo08() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        Map<String, String> map = new HashMap<String,String>();
        map.put("bbb","张三");
        System.out.println(userMapper.findUserByMap(map));
        session.close();
    }

    @Test
    public  void demo09() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        System.out.println(userMapper.finUserNameAndAddressById(33));
        session.close();
    }

    @Test
    public  void demo10() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        System.out.println(userMapper.testResultMap(33));
        session.close();
    }

    @Test
    public  void demo11() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("小");
        System.out.println(userMapper.testIfAndWhereLabel(user));
        session.close();
    }

    /**
     * 注解式测试查询
     */
    @Test
    public  void demo12() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.getUserById(33);
        System.out.println(user);
        session.close();
    }

    /**
     * 注解式测试插入
     */
    @Test

    public  void demo13() throws IOException {
        //加载 mybatis 的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
        //构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中 sql 的 sqlSession
        SqlSession session = sessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);

        User user = new User();
        user.setUsername("丁文胜");
        user.setSex(1);
        user.setAddress("枞阳");
        user.setBirthday(new Date("1995/06/13"));
        int i = userMapper.insertUser(user);
        System.out.println(i);
        session.commit();
        session.close();
    }
    /**
     *
     */
}
