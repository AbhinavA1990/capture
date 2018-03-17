package com.slk.capture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.Contact;
import com.slk.capture.repo.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public Contact addContact(Long mobileNo, String emailId, Integer extension) {
		   Contact contact = new Contact();
	       contact.setEmailId(emailId);
	       contact.setMobileNo(mobileNo);
	       contact.setExtension(extension);
	       return contactRepository.save(contact);	
	}

	@Override
	public Contact getContact(Long graphID) {
		return contactRepository.findOne(graphID);
	}

	@Override
	public List<Contact> getAllContact() {
		 return (List<Contact>) contactRepository.findAll();
	}

	
}
