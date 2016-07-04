package com.plato.service;

import java.util.List;

import com.plato.model.Customer;
import com.plato.repository.CustomerRepository;
import com.plato.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	
	
	public CustomerRepository customerRepository;
	
	public CustomerServiceImpl(){
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
		
	}
	
	
	
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	
	/* (non-Javadoc)
	 * @see com.plato.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	
}
