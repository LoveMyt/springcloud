package com.example.springbootconsul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hi")
    public String home(){
        return "hi, I'm miya";
    }
}
