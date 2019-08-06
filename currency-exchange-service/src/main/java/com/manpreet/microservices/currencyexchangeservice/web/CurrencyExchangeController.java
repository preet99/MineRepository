package com.manpreet.microservices.currencyexchangeservice.web;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manpreet.microservices.currencyexchangeservice.domain.ExchangeValue;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from , @PathVariable String to)
	{
		ExchangeValue ex =  new ExchangeValue(1000, "USD" , "INR", BigDecimal.valueOf(65));
		ex.setPort(Integer.parseInt(environment.getProperty("server.port")));
		return ex;
		
	}
}
