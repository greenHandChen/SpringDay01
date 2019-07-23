package com.springbootdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Component
public class MailServiceImpl implements MailService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;
    @Override
    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);

        try {
            mailSender.send(mailMessage);
            LOGGER.info("简单邮件已经发送");
        } catch (MailException e) {
            LOGGER.error("发送失败",e);
        }

    }

    @Override
    public void sendHtmlMail(String to, String subject, String content) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        try {
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setSubject(subject);
            helper.setTo(to);
            helper.setText(content);
          //  helper.setCc("");//抄送
            mailSender.send(message);
            LOGGER.info("html邮件已经发送。");
        } catch (MessagingException e) {
            LOGGER.info("发送失败");
            e.printStackTrace();
        }
    }

    @Override
    public void sendAttachmentsMail(String to, String subject, String content, String filePath) {
        MimeMessage message = mailSender.createMimeMessage();
        try {
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setSubject(subject);
            helper.setTo(to);
            helper.setText(content);
           // helper.setCc("liyingying@heatedloan.com");//抄送
            //添加附件
            FileSystemResource file = new FileSystemResource(new File(filePath));
            String fileName = file.getFilename();
            helper.addAttachment(fileName,file);
            mailSender.send(message);
            LOGGER.info("带附件邮件已经发送。");
        } catch (MessagingException e) {
            LOGGER.info("发送失败",e);
            e.printStackTrace();
        }
    }

    @Override
    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId) {
        MimeMessage message = mailSender.createMimeMessage();
        try {
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setSubject(subject);
            helper.setTo(to);
            helper.setText(content);
            helper.setCc("liyingying@heatedloan.com");//抄送
            //添加附件
            FileSystemResource file = new FileSystemResource(new File(rscPath));
            helper.addInline(rscId,file);
            mailSender.send(message);
            LOGGER.info("带静态资源文件邮件已经发送。");
        } catch (MessagingException e) {
            LOGGER.error("发送失败",e);
            e.printStackTrace();
        }
    }

    @Override
    public void sendTemplateMail(String to) {

    }
}
