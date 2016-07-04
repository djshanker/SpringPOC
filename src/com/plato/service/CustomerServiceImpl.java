package com.plato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plato.model.Customer;
import com.plato.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	

	public CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("We're in Constructor!");
		this.customerRepository = customerRepository;
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We're using setter injection!");
		this.customerRepository = customerRepository;
	}
	/* (non-Javadoc)
	 * @see com.plato.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	
}
