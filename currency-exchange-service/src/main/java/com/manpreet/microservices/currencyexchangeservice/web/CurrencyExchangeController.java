package com.manpreet.microservices.currencyexchangeservice.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manpreet.microservices.currencyexchangeservice.domain.ExchangeValue;
import com.manpreet.microservices.currencyexchangeservice.repo.ExchangeServiceRepository;

@RestController
public class CurrencyExchangeController {
	Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeServiceRepository exchangeServiceRepository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from , @PathVariable String to)
	{
		ExchangeValue ex = exchangeServiceRepository.findByFromAndTo(from,to);
		logger.info("{}",ex);
				//new ExchangeValue(1000, "USD" , "INR", BigDecimal.valueOf(65));
		ex.setPort(Integer.parseInt(environment.getProperty("server.port")));
		return ex;
		
	}
}
