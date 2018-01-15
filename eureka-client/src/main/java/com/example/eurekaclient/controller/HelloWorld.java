package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloWorld {

    @Value("${server.port}")
    private String port;
    @RequestMapping("/h1")
    @ResponseBody
    public String home () {
        return "hello World ：" + port;
    }
}
