package com.java.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.java.domain.Customer;
@Component
public interface CustomerService {
	
	public List<Customer> listCustomers();

	public void save(Customer customer);

	public Customer getCustomer(long customerId);

	public void deleteCustomer(long customerId);

}
