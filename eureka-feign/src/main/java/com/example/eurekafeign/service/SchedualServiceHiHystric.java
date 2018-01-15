package com.example.eurekafeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements HelloService {
    @Override
    public String sayHiFromClientOne() {
        return "sorry!!!";
    }
}
