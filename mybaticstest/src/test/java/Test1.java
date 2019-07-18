import com.jmx.dao.UserDao;
import com.jmx.dao.UserDaoImpl;
import com.jmx.dao.UserMapper;
import com.jmx.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        InputStream  is = null;
        try {
            is = Resources.getResourceAsStream("config/SqlMapperConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
         sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);


    }
    public  void demo01() {
        InputStream is= null;
        try {
            is = Resources.getResourceAsStream("config/SqlMapperConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        /* 根据ID查询*/
      /*  Account account=sqlSession.selectList("test.findUserById",2);
        System.out.println(account);*/
        /*模糊查询*/
       /* List<Account> account=sqlSession.selectList("test.findUserByName","'%B' OR 1=1");
        System.out.println(account);*/
      /* 添加单个用户*/
       /* Account account=new Account();
        account.setMoney("1000000");
        account.setUsername("江民喜");
        int a=sqlSession.insert("test.addUser",account);
        sqlSession.commit();
        System.out.println(a);*/
       /* 添加用户并返回用户参数,这里为主键*/
        Account account=new Account();
        account.setMoney("1000000");
        account.setUsername("江民喜");
        int a=sqlSession.insert("test.addUserGetUUID",account);
        sqlSession.commit();
        //System.out.println(account);
        sqlSession.close();

    }
    public void demo02(){
       /* UserDaoImpl userDao=new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);*/
       /* Account account=userDao.findUserById(2);
        System.out.println(account);*/
       /*Account account=new Account();
       account.setUsername("mxj");
       account.setMoney("200000000");
       int a=userDao.addUser(account);
       System.out.println(a);*/
      /* List<Account> list=userDao.findUserByName("'%j%'");*/
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper map=sqlSession.getMapper(UserMapper.class);
        System.out.println(map.findUserById(2));

    }
    public static void main(String args[]){
        Test1 test=new Test1();
        test.demo02();



    }
}
