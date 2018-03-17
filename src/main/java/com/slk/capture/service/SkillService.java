package com.slk.capture.service;

import java.util.List;

import com.slk.capture.model.Skill;

public interface SkillService {

	public Skill addSkill(String skillName, String skillDescription, String skillType);

	public Skill getSkill(Long graphId);
	
	public List<Skill> getAllSkill();

}
