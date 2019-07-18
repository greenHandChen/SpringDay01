import com.jqh.dao.UserDao;
import com.jqh.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

/**
 * @Auther: 几米
 * @Date: 2019/7/18 10:19
 * @Description: TestDao
 */
public class TestDao {
    private UserDao userDao=new UserDao();
    @Test
    public void testSelect() throws Exception {
        User user = userDao.findByUserId(1);
        System.out.println(user);
    }
    @Test
    public void testInsert()throws Exception{
        int i = userDao.addUser(new User("不悔", new Date(), 1, "大连"));
        System.out.println(i);
    }
}
