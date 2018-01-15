package com.example.sleuthservicemiya.controller;

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
    public static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String home () {
        logger.info("miya is being called  /hi" );
        return "hi  i'm miya";
    }
    @RequestMapping("/miya")
    public String info(){
        logger.info("miya info is being called /miya");
        return restTemplate.getForObject("http://localhost:8988/info",String.class);
    }

    @RequestMapping("/miyah")
    public String helloWorld(){
        logger.info("helloworld miya ...");
        return restTemplate.getForObject("http://localhost:8988/hellohi",String.class);
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
