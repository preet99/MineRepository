package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rest/hello")
@Controller
public class HelloResource {
	
	@GetMapping
	public String hello()
	{
		return "helloWorld";
	}

}
