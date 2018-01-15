package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FooController {
    @Value("${foo}")
    String foo;

    @ResponseBody
    @RequestMapping("hi")
    public String h1(){
        System.out.println(foo + " ================================ ");
        return foo;
    }
}
