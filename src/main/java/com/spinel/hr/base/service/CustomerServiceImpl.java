package com.spinel.hr.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spinel.hr.base.domain.Customer;
import com.spinel.hr.base.repository.AbstractRepo;
import com.spinel.hr.base.repository.CustomerRepo;

@Service
public class CustomerServiceImpl extends AbstractServiceImpl<Customer> implements CustomerService{

	@Autowired
	CustomerRepo repo;
	
	@Override
	public AbstractRepo<Customer> getRepo() {
		return repo;
	}

}
