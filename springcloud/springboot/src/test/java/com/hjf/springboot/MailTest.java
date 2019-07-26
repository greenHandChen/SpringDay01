package com.hjf.springboot;

import com.hjf.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * ClassName:MailTest
 * Author:Hejunfeng
 * Date:2019/7/23 10:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {
    @Resource
    private MailService mailService;

    @Test
    public void  sendSimpleMail() throws  Exception{
        mailService.sendSimpleMail("2589074893@qq.com","弟弟行为","弟弟");
    }

    @Test
    public void  sendHtmlMail() throws  Exception{
        mailService.sendHtmlMail("2589074893@qq.com","弟弟的HTML行为","弟弟舔狗");
    }

    @Test
    public void sendAttachmentsMail() throws  Exception{
        mailService.sendAttachmentsMail("2589074893@qq.com","弟弟的附件行为","弟弟舔狗","C:\\Users\\Hejunfeng\\Desktop\\弟弟附件.txt");
    }

    @Test
    public void sendInlineResourceMail() throws  Exception{
        mailService.sendAttachmentsMail("2589074893@qq.com","弟弟的附件行为","弟弟舔狗","C:\\Users\\Hejunfeng\\Desktop\\1.png");
    }
}