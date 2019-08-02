package com.manpreet.helloWorld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@Autowired
	@Qualifier("resourceBundleMessageSource")
	private MessageSource messageSource;

	@GetMapping("/helloWorld/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(name);
	}

	@GetMapping("/helloWorld/internationlization")
	public String helloWorldBean(@RequestHeader(name = "Accept-Language") Locale locale) {
		return messageSource.getMessage("goodMorning", null, locale);
	}

}
