import com.hand.lq.service.Test1Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test02 {
    @Autowired
    Test1Service test1Service;
    @Test
    public void test1(){

        test1Service.findOrderExt();
    }
}
