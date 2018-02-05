package com.slk.capture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.CustomerBU;
import com.slk.capture.repo.CustomerBURepository;

@Service
public class CustomerBUServiceImpl implements CustomerBUService {

	@Autowired
	private CustomerBURepository customerBuRepository;

	@Override
	public void createCustomerBU(CustomerBU customerBU) {
		customerBuRepository.save(customerBU);
	}
}
