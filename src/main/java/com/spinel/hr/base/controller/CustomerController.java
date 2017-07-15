package com.spinel.hr.base.controller;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spinel.hr.base.domain.Address;
import com.spinel.hr.base.domain.Customer;
import com.spinel.hr.base.domain.User;
import com.spinel.hr.base.service.CustomerService;

@Controller
@RequestMapping("customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<Customer> get(){
		
		return customerService.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Customer post(@RequestBody Customer customer){
		return customerService.saveAndFlush(customer);
	}
	
	@PostConstruct
	public void createDefaultCustomer(){
		Customer test = new Customer();
		test.setName("CustName");
		test.setAddress(new Address());
		test.getAddress().setCity("City");
		customerService.saveAndFlush(test);
	}
	
}
