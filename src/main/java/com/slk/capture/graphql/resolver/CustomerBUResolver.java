package com.slk.capture.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.slk.capture.model.Contact;
import com.slk.capture.model.CustomerBU;
import com.slk.capture.repo.ContactRepository;
import com.slk.capture.repo.CustomerBURepository;

@Component
public class CustomerBUResolver implements GraphQLResolver<Contact> {

	@Autowired
	private CustomerBURepository CustomerBURepository;

	public Long getGraphId(CustomerBU customerbu) {
		return customerbu.getGraphId();
	}
}