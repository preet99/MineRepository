package com.java.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.Dao.CustomDao;
import com.java.domain.Customer;
import com.java.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomDao customerDao;

	@Transactional
	public List<Customer> listCustomers() {
		return customerDao.listCustomers();
	}

	@Transactional
	public void save(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	@Transactional
	public Customer getCustomer(long customerId) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(customerId);
	}

	@Transactional
	public void deleteCustomer(long customerId) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(customerId);
	}

}
