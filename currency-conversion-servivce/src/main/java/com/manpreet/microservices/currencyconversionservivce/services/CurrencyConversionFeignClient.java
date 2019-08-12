package com.manpreet.microservices.currencyconversionservivce.services;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manpreet.microservices.currencyconversionservivce.Domain.CurrencyConversionBean;

@FeignClient(name = "conversion-exchange-service")
@RibbonClient(name = "conversion-exchange-service", configuration = LocalRibbonClientConfiguration.class)
public interface CurrencyConversionFeignClient {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	CurrencyConversionBean currencyExchangeService(@PathVariable String to, @PathVariable String from);
}
