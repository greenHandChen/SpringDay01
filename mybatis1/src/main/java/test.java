import com.masirhh.mybatis1.beans.orderExtByMap;
import com.masirhh.mybatis1.beans.orderExtByType;
import com.masirhh.mybatis1.beans.orderExtDdd;
import com.masirhh.mybatis1.mappers.orderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
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
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);


    @Test
    public void test1() {
        //3.读取Sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        orderMapper orderMapper = sqlSession.getMapper(com.masirhh.mybatis1.mappers.orderMapper.class);
        List<orderExtByType> orderExtByTypes = orderMapper.findOrdersExtByType();
        for (orderExtByType oe : orderExtByTypes
        ) {
            System.out.println(oe + "username = " + oe.getUsername() + " useraddress : " + oe.getAddress());
        }
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        orderMapper orderMapper = sqlSession.getMapper(com.masirhh.mybatis1.mappers.orderMapper.class);
        List<orderExtByMap> orderExtByMaps = orderMapper.findOrdersExtByMap();
        for (orderExtByMap oe : orderExtByMaps
        ) {
            System.out.println(oe.toString() + oe.getUserBean().toString());
        }
        sqlSession.close();
    }

    @Test
    public void test3() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        orderMapper orderMapper = sqlSession.getMapper(com.masirhh.mybatis1.mappers.orderMapper.class);
        List<orderExtDdd> odds = orderMapper.findDetailsDDD();
        for (orderExtDdd odds1 : odds
        ) {
            System.out.println(odds1.toString() + odds1.getUserBean() + odds1.getOrderdetail());
        }
        sqlSession.close();
    }

}
