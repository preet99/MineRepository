package com.manpreet.microservices.currencyconversionservivce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import brave.sampler.Sampler;

@ComponentScan("com.manpreet.microservices.currencyconversionservivce.*")
@SpringBootApplication
@EnableFeignClients("com.manpreet.microservices.currencyconversionservivce.*")
@RibbonClient(name = "currency-exchange-service")
@EnableDiscoveryClient
public class CurrencyConversionServivceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServivceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
