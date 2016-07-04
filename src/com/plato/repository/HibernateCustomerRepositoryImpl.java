package com.plato.repository;

import java.util.ArrayList;
import java.util.List;

import com.plato.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.plato.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstName("DJ");
		customer.setLastName("Shankster");
		
		
		customers.add(customer);
		
		return customers;
		
		
	}

}
