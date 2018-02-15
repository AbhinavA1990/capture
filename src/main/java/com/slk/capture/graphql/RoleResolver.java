package com.slk.capture.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.slk.capture.model.Contact;
import com.slk.capture.model.Role;
import com.slk.capture.repo.ContactRepository;
import com.slk.capture.repo.RoleRepository;

@Component
public class RoleResolver implements GraphQLResolver<Contact> {

	@Autowired
	private RoleRepository roleRepository;

	public Long getGraphId(Role role) {
		return role.getGraphId();
	}
}