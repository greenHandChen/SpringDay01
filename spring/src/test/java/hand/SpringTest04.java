package hand;

import com.hand.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by HuangHeng on 2019/7/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext04.xml")
public class SpringTest04 {

    /**
     * 注入代理类
     */
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void test(){
        accountService.transfer("bbb","aaa",200d);
    }
}
