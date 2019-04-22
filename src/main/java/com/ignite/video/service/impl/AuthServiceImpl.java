package com.ignite.video.service.impl;

import com.ignite.video.domain.User;
import com.ignite.video.mapper.UserMapper;
import com.ignite.video.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthServiceImpl implements AuthService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUser(String name, String password) {
        User user = userMapper.findByNamePass(name,password);
        System.out.println(user);
        return null;
    }
}
