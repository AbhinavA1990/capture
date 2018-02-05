package com.slk.capture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.Contact;
import com.slk.capture.model.Skill;

@Service
public class TestService {

	@Autowired
	private ContactService contactService;

	@Autowired
	private CustomerBUService customerBUService;

	@Autowired
	private ProfileService profileService;

	@Autowired
	private SkillService skillService;

	public void test() {
		Contact contact = new Contact();
		contact.setEmailId("");
		contact.setExtn(1111);
		contact.setMobileNo(999898989L);
		contactService.createContact(contact);

		Skill skill = new Skill();
		skill.setSkillName("Java");
		skill.setSkillType("Programming Language");
		skill.setSkillDescription("");
		skillService.addSkill(skill);

		Skill skill1 = new Skill();
		skill1.setSkillName("Dot Net");
		skill1.setSkillType("Programming Language");
		skill1.setSkillDescription("");
		skillService.addSkill(skill1);
	}
}
