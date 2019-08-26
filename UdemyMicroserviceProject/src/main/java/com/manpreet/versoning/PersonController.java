package com.manpreet.versoning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@GetMapping(value = "/personV", params = "version=1")
	public PersonVer1 personV1() {
		return new PersonVer1("Manpreet Mann");
	}

	@GetMapping(value = "/personV", params = "version=2")
	public PersonVer2 personV2() {
		return new PersonVer2(new Name("Manpreet", "Mann"));
	}

}
