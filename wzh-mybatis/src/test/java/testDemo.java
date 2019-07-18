import com.wzh.domain.User;
import com.wzh.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

public class testDemo {
    @Test
    public void demo1() throws IOException {
        //通过Mybatis包中的Resources对象很轻松的获取到配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapconfig.xml");
        //通过SqlSessionFactoryBuilder创建
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //获得session实例
        SqlSession session =sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user =  mapper.findUserById(10);
        System.out.println(user);

    }
}
