import com.yonye.mybatis.mapper.UsersMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Yonye
 * @Date:2019/7/18 20:24
 * @Version:1.0
 * @deseription:
 **/
public class MybatisSpringTest {

    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-context.xml");
    @Before
    public void test(){

        UsersMapper usersMapper=applicationContext.getBean("usersMapper",UsersMapper.class);
        System.out.println(usersMapper.countUser());
    }

    @Test
    public void test1(){

    }


}
