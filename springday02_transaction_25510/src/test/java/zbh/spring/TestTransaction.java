package zbh.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: wuhui
 * @time: 2019/7/17 11:36
 * @desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestTransaction {
    @Autowired
    AccountServiceImpl service;
    @Test
    public void test01(){
        service.transfer("me","you",10d);
    }
}
