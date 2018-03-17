package com.slk.capture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.CustomerBU;
import com.slk.capture.repo.CustomerBURepository;

@Service
public class CustomerBUServiceImpl implements CustomerBUService {

	@Autowired
	private CustomerBURepository customerBuRepository;

	@Override
	public CustomerBU addCustomerBU(String cbuName, String cbuType) {
	CustomerBU customerbu = new CustomerBU();
    	customerbu.setCbuName(cbuName);
    	customerbu.setCbuType(cbuType);
    	return customerBuRepository.save(customerbu);
		
	}

	@Override
	public CustomerBU getCustomerBU(Long graphId) {
		return customerBuRepository.findOne(graphId);
	}

	@Override
	public List<CustomerBU> getAllCustomerBU() {
		return (List<CustomerBU>) customerBuRepository.findAll();
	}





}
