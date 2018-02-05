package com.slk.capture.repo;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.slk.capture.model.CustomerBU;

public interface CustomerBURepository extends GraphRepository<CustomerBU> {

}
