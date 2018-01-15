package com.example.serverribbon.controller;

import com.example.serverribbon.server.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "h1")
    public String hi(){
        return helloService.hiService("hello/h1");
    }
}
