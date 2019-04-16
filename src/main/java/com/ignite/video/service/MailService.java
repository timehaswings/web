package com.ignite.video.service;

import org.springframework.stereotype.Service;

@Service
public interface MailService {

    public void sendMail(String title,String body);

}
