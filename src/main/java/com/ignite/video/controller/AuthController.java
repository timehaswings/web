package com.ignite.video.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/auth")
public class AuthController {

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }



}
