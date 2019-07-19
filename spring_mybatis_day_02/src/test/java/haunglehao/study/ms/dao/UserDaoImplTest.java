package haunglehao.study.ms.dao;

import huanglehao.study.ms.dao.UserDao;
import huanglehao.study.ms.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 16:24 2019/7/19
 */
public class UserDaoImplTest {

    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
         ctx=new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");

    }

    @Test
    public void testFindUserById()throws Exception{
        UserDao dao=(UserDao)ctx.getBean("userDao");
        User user=dao.findUserById(1);
        System.out.println(user);
    }
}
