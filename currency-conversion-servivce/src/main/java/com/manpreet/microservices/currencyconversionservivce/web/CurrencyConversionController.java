package com.manpreet.microservices.currencyconversionservivce.web;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manpreet.microservices.currencyconversionservivce.Domain.CurrencyConversionBean;

public class CurrencyConversionController {

	@GetMapping("/cuurencyConversion/from/{from}/to/{to}/quantity/{quantity}")
	private CurrencyConversionBean retrieveCurrencyConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
				return new CurrencyConversionBean(1,from,to,BigDecimal.ONE,quantity,BigDecimal.ONE,0);

	}
}
