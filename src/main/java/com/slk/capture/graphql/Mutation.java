package com.slk.capture.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.slk.capture.model.Skill;
import com.slk.capture.repo.SkillRepository;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private SkillRepository skillRepo;

	public Skill writeSkill(String skillName, String skillDescription, String skillType) {
		Skill skill = new Skill();
		skill.setSkillName(skillName);
		skill.setSkillDescription(skillDescription);
		skill.setSkillType(skillType);
		return skillRepo.save(skill);
	}

}
