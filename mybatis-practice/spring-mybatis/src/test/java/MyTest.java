import com.jqh.mapper.UserMapper;
import com.jqh.pojo.User;
import com.jqh.util.BeanUtil;
import org.junit.Test;

/**
 * @Auther: 几米
 * @Date: 2019/7/19 10:48
 * @Description: MyTest
 */
public class MyTest {
    @Test
    public void test(){
        UserMapper mapper= BeanUtil.getBean(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user);
    }
}
