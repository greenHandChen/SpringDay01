package test;

import com.hand.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HuangHeng on 2019/7/19
 */
public class test {

    @Test
    public void getUser(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationcontext.xml");
        User getUser = (User) applicationContext.getBean("getUser");
        System.out.println(getUser);
    }
}
