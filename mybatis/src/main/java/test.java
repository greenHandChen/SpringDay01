import com.masirhh.mybatis.beans.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test  {
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
    SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    //3.读取Sqlsession
    SqlSession sqlSession=sqlSessionFactory.openSession();

    @Test
    public void test1() throws IOException {

    //4.执行查询      第一个参数是命名空间 参加mapper里面的命名空间 第二个参数是传入类型
        User user=sqlSession.selectOne("test.findUserById",10);
        System.out.println(user);
    //5.关闭Sqlsession
        sqlSession.close();
    }

    @Test
    public void test2(){
        //4.执行查询      第一个参数是命名空间 参加mapper里面的命名空间 第二个参数是传入类型
        List<User> user=sqlSession.selectList("test.findUserByUsername","'%明%' or id=10");
        System.out.println(user);
        //5.关闭Sqlsession
        sqlSession.close();
    }


}
