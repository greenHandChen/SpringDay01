package com.example.springbootdemo.service;

public interface MailService {

    void sendSimpleEmail(String to,String subject,String content);

    void sendHtmlEmail(String to,String subject,String content);

    void sendAttachmentsEmail(String to,String subject,String content);

    void sendInlineResourceEmail(String to,String subject,String content);

    void sendTemplateEmail(String to,String subject,String content);
}
