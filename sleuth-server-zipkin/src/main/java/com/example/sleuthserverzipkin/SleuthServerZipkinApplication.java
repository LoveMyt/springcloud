package com.example.sleuthserverzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SleuthServerZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthServerZipkinApplication.class, args);
	}
}
