package com.example.sleuthservicehi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class.getName());
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hellohi")
    public String helloworld(){
        return "aaaaaa";
    }

    @RequestMapping("/hi")
    public String callHome(){
        log.info("calling trace service-hi /hi");
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }

    @RequestMapping("/info")
    public String info(){
        log.info("calling trace service-hi /info");
        return "i'm service-hi";
    }



    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
