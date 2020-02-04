package org.baeldung.web.controller;

import javax.validation.Valid;

import org.baeldung.persistence.dao.CustomerRepository;
import org.baeldung.persistence.model.Customer;
import org.baeldung.web.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/uploadDocs")
	@ResponseBody
	public String saveCustomer(@Valid final CustomerDto customerDto)
	{ System.out.println("Hi i am in user controller");
		Customer customer = new Customer();
		customer.setName(customerDto.getName());
		customerRepository.save(customer);
		return null;
		
	}
	
}
