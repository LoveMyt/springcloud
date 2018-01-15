package com.example.eurekafeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client", fallback = SchedualServiceHiHystric.class)
public interface HelloService {
    @RequestMapping(value = "hello/h1", method = RequestMethod.GET)
    String sayHiFromClientOne();
}
