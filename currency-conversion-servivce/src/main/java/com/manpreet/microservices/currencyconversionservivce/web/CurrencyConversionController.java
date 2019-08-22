package com.manpreet.microservices.currencyconversionservivce.web;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.manpreet.microservices.currencyconversionservivce.Domain.CurrencyConversionBean;
import com.manpreet.microservices.currencyconversionservivce.services.CurrencyConversionFeignClient;

@RestController
public class CurrencyConversionController {

	Logger logger = LoggerFactory.getLogger(CurrencyConversionController.class);
	@Autowired
	private CurrencyConversionFeignClient currencyConversionFeignClient;

	@GetMapping("/cuurencyConversion/from/{from}/to/{to}/quantity/{quantity}")
	private CurrencyConversionBean retrieveCurrencyConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("to", to);
		map.put("from", from);
		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class, map);
		CurrencyConversionBean response = responseEntity.getBody();
		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), response.getPort());

	}

	@GetMapping("/cuurencyConversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	private CurrencyConversionBean retrieveCurrencyConversionFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		CurrencyConversionBean response = currencyConversionFeignClient.currencyExchangeService(to, from);
		logger.info("{}",response);
		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), response.getPort());

	}
}
