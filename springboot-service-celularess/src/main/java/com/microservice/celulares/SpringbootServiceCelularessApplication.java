package com.microservice.celulares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootServiceCelularessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceCelularessApplication.class, args);
	}

}
