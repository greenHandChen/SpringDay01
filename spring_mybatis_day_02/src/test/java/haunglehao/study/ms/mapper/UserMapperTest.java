package haunglehao.study.ms.mapper;

import huanglehao.study.ms.dao.UserDao;
import huanglehao.study.ms.mapper.UserMapper;
import huanglehao.study.ms.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 17:09 2019/7/19
 */
public class UserMapperTest {
    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx=new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");

    }

    @Test
    public void testFindUserById()throws Exception{
        UserMapper userMapper=(UserMapper)ctx.getBean("userMapper");
        User user=userMapper.findUserById(1);
        System.out.println(user);
    }
}
