package com.manpreet.microservices.limitsservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manpreet.microservices.limitsservice.config.Configration;
import com.manpreet.microservices.limitsservice.domain.LimitConfigration;

@RestController
public class LimitCongigrationController {
	@Autowired
	private Configration config;

	@GetMapping("/limits")
	public LimitConfigration retrieveLimitsFromConfigration() {
		//return new LimitConfigration(1000, 1);
		return new LimitConfigration(config.getMinimum(), config.getMaximum());
	}

}
