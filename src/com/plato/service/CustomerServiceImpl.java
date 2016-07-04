package com.plato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.plato.model.Customer;
import com.plato.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	public CustomerServiceImpl(){}
	
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository repository){
		System.out.println("Using Constructor Injection");
		this.customerRepository =  repository;
	}
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Using setter Injection");

		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.plato.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	
}
