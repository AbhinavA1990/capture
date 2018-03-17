package com.slk.capture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.Skill;
import com.slk.capture.repo.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillRepository skillRepository;

	@Override
	public Skill addSkill(String skillName, String skillDescription, String skillType) {
		Skill skill = new Skill();
		skill.setSkillName(skillName);
		skill.setSkillDescription(skillDescription);
		skill.setSkillType(skillType);
		return skillRepository.save(skill);
	}


	@Override
	public Skill getSkill(Long graphId) {
		return skillRepository.findOne(graphId);	
	}

	@Override
	public List<Skill> getAllSkill() {
		return (List<Skill>) skillRepository.findAll();
	}
}
