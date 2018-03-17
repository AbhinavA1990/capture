package com.slk.capture.service;

import java.util.List;

import com.slk.capture.model.CustomerBU;

public interface CustomerBUService {


	public CustomerBU addCustomerBU(String cbuName,String cbuType);
	
	 public CustomerBU getCustomerBU(Long graphId);
	 
	 public List<CustomerBU> getAllCustomerBU();
	
}
