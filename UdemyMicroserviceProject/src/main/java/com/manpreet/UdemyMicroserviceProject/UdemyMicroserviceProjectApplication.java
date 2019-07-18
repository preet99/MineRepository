package com.manpreet.UdemyMicroserviceProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.manpreet"})
public class UdemyMicroserviceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyMicroserviceProjectApplication.class, args);
	}

}
