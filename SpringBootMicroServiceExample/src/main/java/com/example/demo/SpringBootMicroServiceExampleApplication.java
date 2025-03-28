package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//spring application comment
@SpringBootApplication
@EnableEurekaServer
public class SpringBootMicroServiceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroServiceExampleApplication.class, args);
	}

}
