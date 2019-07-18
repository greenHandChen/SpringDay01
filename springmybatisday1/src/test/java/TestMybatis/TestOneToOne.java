package TestMybatis;

import com.softeem.dao.PersonMapper;
import com.softeem.dto.Card;
import com.softeem.dto.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestOneToOne {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public  void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void demo1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        PersonMapper personMapper =  sqlSession.getMapper(PersonMapper.class);
        Person person =  personMapper.getPerson(2);
        System.out.println(person);
    }
@Test
    public void demo2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        PersonMapper personMapper =  sqlSession.getMapper(PersonMapper.class);
        Card card =  personMapper.get(3);
        System.out.println(card);
    }


}
