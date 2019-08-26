package com.manpreet.courseExample;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@Controller
public class someBeanController {

	@GetMapping(value = "/filtering")
	public SomeBean filter() {
		SomeBean bean = new SomeBean("m1", "m2", "m3");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1");
		SimpleFilterProvider filters = new SimpleFilterProvider().addFilter("somBeanFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(bean);
		mapping.setFilters(filters);
		return bean;

	}

}
