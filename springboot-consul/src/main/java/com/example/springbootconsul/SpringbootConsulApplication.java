package com.example.springbootconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConsulApplication.class, args);
	}
}
