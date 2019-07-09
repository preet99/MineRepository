package com.manpreet.Oath2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.config"})
public class Oath2Application {

	public static void main(String[] args) {
		SpringApplication.run(Oath2Application.class, args);
	}

}
