package com.example.eurekafeign.controller;

import com.example.eurekafeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/h1", method = RequestMethod.GET)
    public String sayH(){
        return helloService.sayHiFromClientOne();
    }
}
