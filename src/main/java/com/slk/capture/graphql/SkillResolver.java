package com.slk.capture.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.slk.capture.model.Skill;
import com.slk.capture.repo.SkillRepository;

@Component
public class SkillResolver implements GraphQLResolver<Skill> {

	@Autowired
	private SkillRepository skillRepository;

	public Long getGraphId(Skill skill) {
		return skill.getGraphId();
	}

	public String getSkillId(Skill skill) {
		return skill.getSkillId();
	}

}
