package com.slk.capture.service;

import java.util.List;

import com.slk.capture.model.Skill;

public interface SkillService {

	public void addSkill(Skill skill);

	public List<Skill> getSkills();

}
