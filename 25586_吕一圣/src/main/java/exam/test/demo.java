package exam.test;

import exam.domain.OrdersExt;
import exam.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class demo {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory  = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void result(){

        SqlSession session = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);

        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(5);
        userMapper.findOrdersExts(ordersExt);
        session.close();

    }
}
