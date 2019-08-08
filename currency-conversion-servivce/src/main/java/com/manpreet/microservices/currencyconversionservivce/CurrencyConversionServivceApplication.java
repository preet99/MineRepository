package com.manpreet.microservices.currencyconversionservivce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.manpreet.microservices.currencyconversionservivce.*")
@SpringBootApplication
@EnableFeignClients("com.manpreet.microservices.currencyconversionservivce.*")
public class CurrencyConversionServivceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServivceApplication.class, args);
	}

}
