
import com.jmx.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.IOException;
import java.io.InputStream;

public class Test1{

    public void demo01() {
        InputStream is= null;
        try {
            is = Resources.getResourceAsStream("config/SqlMapperConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Account account=sqlSession.selectOne("test.findUserById",1);
        System.out.println(account);
        sqlSession.close();

    }
    public static void main(String args[]){
        Test1 t=new Test1();
        t.demo01();;



    }
}
