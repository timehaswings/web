package com.ignite.video.service;

import com.ignite.video.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    public User findUser(String account, String password);
}
