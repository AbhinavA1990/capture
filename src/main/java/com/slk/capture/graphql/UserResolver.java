package com.slk.capture.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.slk.capture.model.Contact;
import com.slk.capture.model.User;
import com.slk.capture.repo.ContactRepository;
import com.slk.capture.repo.UserRepository;

@Component
public class UserResolver implements GraphQLResolver<User> {

	@Autowired
	private UserRepository userRepository;

	public Long getGraphId(User user) {
		return user.getGraphId();
	}
}