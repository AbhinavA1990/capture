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
		contact.setEmailId("asdad");
		contact.setExtn(112611);
		contact.setMobileNo(9998928989L);
		contactService.createContact(contact);

		Skill skill = new Skill();
		skill.setSkillName("Java1");
		skill.setSkillType("Programming Language1");
		skill.setSkillDescription("ac");
		skillService.addSkill(skill);

		Skill skill1 = new Skill();
		skill1.setSkillName("Dot Net1d");
		skill1.setSkillType("Programming Languageas");
		skill1.setSkillDescription("asasd");
		skillService.addSkill(skill1);
	}
}
