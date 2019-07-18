package com.mybatis.demo.storeMain;
import com.mybatis.demo.storeDto.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class QueryUser {

    @Test
    public void findUserInfoById() throws IOException {
        //1、读取全局配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3、获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4、执行查询，第一个参数时命名空间.sql的ID，第二个参数是查询的参数
        User user = sqlSession.selectOne("test.findUserById",1);
        List<User> user1 = sqlSession.selectList("test.findUserByName","'王%'");

        System.out.println(user.getUsername());

        for(User user2 : user1){
            System.out.print(user2.getId());
            System.out.print(user2.getUsername());
        }
        //5、关闭、释放连接
        sqlSession.close();
    }
}
