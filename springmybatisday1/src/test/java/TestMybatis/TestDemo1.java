package TestMybatis;

import com.softeem.dto.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class TestDemo1{
    @Test
    public void demo1() throws IOException {
        //1读取全局配置文件
        InputStream is=Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //创建sqlsessionfactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
         //3.获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询，第一个参数是命名空间，第二个是查询参数
        User user =sqlSession.selectOne("com.softeem.dao.UserDao.findUserById",1);
        System.out.println("查询出的是："+user);
        //5.关闭sqlsession，释放连接
        sqlSession.close();


    }
    /*测试${value} 拼接SQL产生的SQL注入问题*/
    @Test
    public void demo2() throws  IOException{
       InputStream is =  Resources.getResourceAsStream("config/SqlMapConfig.xml");
       SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
       SqlSession sqlSession = sqlSessionFactory.openSession();
       List<User> list = sqlSession.selectList("com.softeem.dao.UserDao.findUserByUsername","'%明%' or 1=1");
        System.out.println(list);
        sqlSession.close();



    }


@Test
    public void demo3() throws  IOException{
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setAddress("武汉");
        user.setBirthday(new Date());
        user.setUsername("懒缘");
        user.setSex(1);

        int i = sqlSession.insert("com.softeem.dao.UserDao.addUser",user);
        System.out.println(user.getId()+"dada");
        if (i!=0){
            System.out.println("添加成功");

        }else{
            System.out.println("添加失败");
        }


        sqlSession.commit();

}



}
