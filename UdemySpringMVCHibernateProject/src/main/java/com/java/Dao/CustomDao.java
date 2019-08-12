package com.java.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.domain.Customer;

@Service
public interface CustomDao {
	
public List<Customer> listCustomers();

public void saveCustomer(Customer customer);

public Customer getCustomer(long customerId);

public void deleteCustomer(long customerId);
}
