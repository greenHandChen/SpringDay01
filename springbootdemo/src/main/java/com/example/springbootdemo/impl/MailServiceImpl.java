package com.example.springbootdemo.impl;

import com.example.springbootdemo.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class MailServiceImpl implements MailService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;  //自动注入

    @Value("${mail.fromMail.addr}")
    private String from;

    @Override
    public void sendSimpleEmail(String to, String subject, String content) {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();

        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);
        try {
            mailSender.send(simpleMailMessage);
            logger.info("简单邮件发送");
        }catch (Exception e){
            logger.error("邮件发送异常",e);
        }
    }


    @Override
    public void sendHtmlEmail(String to, String subject, String content) {
        MimeMessage message=mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            mailSender.send(message);
            logger.info("html邮件发送成功");
        } catch ( MessagingException e) {
            logger.error("发送html邮件时发生异常！", e);
        }
    }

    @Override
    public void sendAttachmentsEmail(String to, String subject, String content) {

    }

    @Override
    public void sendInlineResourceEmail(String to, String subject, String content) {

    }

    @Override
    public void sendTemplateEmail(String to, String subject, String content) {

    }
}
