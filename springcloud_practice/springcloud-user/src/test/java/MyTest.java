import app.UserApp;
import app.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: wuhui
 * @time: 2019/7/26 18:25
 * @desc:
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes =UserApp.class)
public class MyTest {
    @Autowired
    UserMapper mapper;
    @Test
    public void test01(){
        System.out.println(mapper.selectById(1));
    }
}
