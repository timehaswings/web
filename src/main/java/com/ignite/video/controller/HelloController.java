package com.ignite.video.controller;


import com.ignite.video.async.Task;
import com.ignite.video.exception.IgniteException;
import com.ignite.video.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Future;


@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private MailService mailService;
    @Autowired
    private Task task;

    @RequestMapping(value = "/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping(value = "/json")
    public String json() throws IgniteException {
        throw new IgniteException("发生错误2");
    }

    @RequestMapping(value = "/index")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://www.timehaswingss.top/");
        return "index";
    }

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "Hello World !";
    }

    @RequestMapping(value = "/mail")
    @ResponseBody
    public String mail(){
        mailService.sendMail("","");
        return "SUCCESS";
    }

    @RequestMapping(value = "/task")
    @ResponseBody
    public String task() throws Exception {
        Future<String> task1 = task.doTaskOne();
        Future<String> task2 = task.doTaskTwo();
        Future<String> task3 = task.doTaskThree();
        return "SUCCESS";
    }

}
