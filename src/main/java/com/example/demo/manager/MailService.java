package com.example.demo.manager;

import javax.mail.MessagingException;

public interface MailService {
    void sendMail(String to, String subject, String content);
    void sendHtmlMail(String to, String subject, String content);
}
