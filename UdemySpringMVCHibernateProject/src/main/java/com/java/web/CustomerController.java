package com.java.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.domain.Customer;
import com.java.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/customer")
	public String getCustomers(Model model) {
		List<Customer> customers = customerService.listCustomers();
		model.addAttribute("customers", customers);
		return "list-customer";

	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		model.addAttribute("customerModel", new Customer());
		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customerModel") Customer customer) {
		customerService.save(customer);
		return "redirect:/customer";
	}

	@GetMapping("/showFormUpdateCustomer")
	public String showFormUpdateCustomer(@RequestParam("customerId") long customerId,Model model) {
		Customer customer = customerService.getCustomer(customerId);
		model.addAttribute("customerModel",customer);
		return "customer-form";
	}
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") long customerId,Model model) {
		customerService.deleteCustomer(customerId);
		return "redirect:/customer";
	}
	

}
