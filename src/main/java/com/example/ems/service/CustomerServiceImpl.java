package com.example.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ems.model.Customer_details;
import com.example.ems.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository userRepo;
	@Override
	public Customer_details createuser(Customer_details details) {
		
		return userRepo.save(details);
	}
	
}
