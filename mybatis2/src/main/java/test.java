import com.masirhh.mybatis2.beans.userBean;
import com.masirhh.mybatis2.dao.userDao;
import com.masirhh.mybatis2.service.userService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        userDao userDao = ctx.getBean(userDao.class);
        userBean userBean=userDao.findUserById(10);

    }

}
