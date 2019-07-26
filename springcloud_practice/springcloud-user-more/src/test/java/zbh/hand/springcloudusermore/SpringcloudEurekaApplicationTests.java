package zbh.hand.springcloudusermore;

import entity.UserMore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zbh.hand.springcloudusermore.service.UserMoreService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudEurekaApplicationTests {

    @Autowired
    UserMoreService service;
    @Test
    public void contextLoads() {
        UserMore userMore = service.selectUserMoreById(1);
        System.out.println(userMore);
        userMore.setMoreInfo("haha");
        service.updateUserMore(userMore);
        System.out.println(service.selectUserMoreById(1));
    }

}
