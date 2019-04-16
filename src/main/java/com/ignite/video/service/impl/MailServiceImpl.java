package com.ignite.video.service.impl;

import com.ignite.video.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendMail(String title, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("test_task@huaqin.com");
        message.setTo("wanggang@huaqin.com");
        message.setSubject("主题：简单邮件少时诵诗书所");
        message.setText("测试邮件内容");
        mailSender.send(message);
    }

}
