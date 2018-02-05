package com.slk.capture.repo;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.slk.capture.model.Skill;

public interface SkillRepository extends GraphRepository<Skill> {

}
