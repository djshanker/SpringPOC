package com.plato.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.plato.model.Customer;

@Repository("customerRepository")
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
