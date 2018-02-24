package com.slk.capture.repo;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.slk.capture.model.CarPool;

public interface CarPoolRepository extends GraphRepository<CarPool> {

}
