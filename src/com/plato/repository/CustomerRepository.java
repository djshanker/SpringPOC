package com.plato.repository;

import java.util.List;

import com.plato.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}