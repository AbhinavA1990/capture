package com.slk.capture.repo;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.slk.capture.model.User;

public interface UserRepository extends GraphRepository<User> {

	User findByEmail(String email);

}
