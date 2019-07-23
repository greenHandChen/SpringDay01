package com.springbootdemo.service;

import javax.mail.MessagingException;

public interface MailService {
    //发送简单邮件
    void sendSimpleMail(String to,String subject,String content);
    //发送HTML邮件
    void sendHtmlMail(String to,String subject,String content) throws MessagingException;
    //发送带附件的邮件
    void sendAttachmentsMail(String to,String subject,String content,String filePath);
    //发送静态资源邮件
    void sendInlineResourceMail(String to,String subject,String content,String rscPath,String rscId);
    //发送摸板邮件
    void sendTemplateMail(String to);
}
