package com.slk.capture.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.slk.capture.model.Skill;
import com.slk.capture.repo.SkillRepository;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private SkillRepository skillRepository;

	public List<Skill> getSkills(String name) {
		return (List<Skill>) skillRepository.findAll();
	}

}
