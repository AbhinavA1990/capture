package com.slk.capture.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.slk.capture.model.Contact;
import com.slk.capture.model.Skill;
import com.slk.capture.repo.ContactRepository;
import com.slk.capture.repo.SkillRepository;

@Component
public class ContactResolver implements GraphQLResolver<Contact> {

	@Autowired
	private ContactRepository contactRepository;

	public Long getGraphId(Contact contact) {
		return contact.getGraphId();
	}

//	public String getSkillId(Contact contact) {
//		return contact.getContactId();
//	}

}
