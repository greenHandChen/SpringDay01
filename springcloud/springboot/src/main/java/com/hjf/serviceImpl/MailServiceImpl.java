package com.hjf.serviceImpl;

import com.hjf.pojo.UserDemo;
import com.hjf.service.MailService;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * ClassName:MailServiceImpl
 * Author:Hejunfeng
 * Date:2019/7/23 9:17
 */
@Service("mailService")
public class MailServiceImpl implements MailService{
    @Resource
    private JavaMailSender mailSender;
    @Value("${mail.fromMail.addr}")
    private String form;
    @Resource
    private FreeMarkerConfigurer freeMarkerConfigurer;
    @Override
    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(form);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        try{
            mailSender.send(message);
            System.out.println("弟弟行为");
        }catch (Exception e){
            System.out.println("什么鬼");
        }
    }

    @Override
    public void sendHtmlMail(String to, String subject, String content) {
        MimeMessage message =mailSender.createMimeMessage();
        try{
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            helper.setFrom(form);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content,true);
            mailSender.send(message);
            System.out.println("成功");
        }catch (MessagingException e){
            System.out.println("失败");
        }
    }

    @Override
    public void sendAttachmentsMail(String to, String subject, String content, String filePath) {
        MimeMessage message = mailSender.createMimeMessage();
        try{
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            helper.setFrom(form);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content,true);

            FileSystemResource file = new FileSystemResource(new File(filePath));
            String fileName=filePath.substring(filePath.lastIndexOf(File.separator));
            helper.addAttachment(fileName,file);

            mailSender.send(message);
            System.out.println("成功");
        }catch (MessagingException e){
            System.out.println("失败");
        }
    }

    @Override
    public void sendInlineResourceMail(String to, String subject, String content, String resPath) {
        MimeMessage message = mailSender.createMimeMessage();
        try{
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            helper.setFrom(form);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content,true);

            FileSystemResource res = new FileSystemResource(new File(resPath));
            String rscId=resPath.substring(resPath.lastIndexOf(File.separator));
            helper.addInline(rscId,res);

            mailSender.send(message);
            System.out.println("成功11");
        }catch (MessagingException e){
            System.out.println("失败");
        }
    }

    @Override
    public void sendTemplateMail(String to) {
//        MimeMessage message = mailSender.createMimeMessage();
//        try{
//            MimeMessageHelper helper = new MimeMessageHelper(message,true);
//            helper.setFrom(form);
//            helper.setTo(to);
//            helper.setSubject("主题：弟弟摸屁股");
//            UserDemo userDemo=new UserDemo();
//            userDemo.setUserId(11);
//            userDemo.setUserName("孙润");
//            userDemo.setUserSex("女");
//            List<UserDemo> testList= new ArrayList<>();
//            testList.add(userDemo);
//            Map<String,Object> model=new HashMap<>();
//            model.put("testList",testList);
//
////           FreeMarkerConfigurer freeMarkerConfigurer= new FreeMarkerConfigurer();
////            freeMarkerConfigurer.setTemplateLoaderPath("classpath:templates");
//            Template template = freeMarkerConfigurer.getConfiguration().getTemplate("test.ftl");
//            String html= FreeMarkerTemplateUtils.processTemplateIntoString(template,model);
//            helper.setText(html,true);
//            mailSender.send(message);
//            System.out.println("成功11");
//        }catch (MessagingException e){
//            System.out.println("失败");
//        }
    }
}