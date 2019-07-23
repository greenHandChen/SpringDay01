package com.springbootdemo;

import com.springbootdemo.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    private MailService mailService;
    @Test
    public void testSimpleMail(){
        mailService.sendSimpleMail("794247476@qq.com","这是一封简单邮件","使用springboot发送的一封邮件！");
    }
}
