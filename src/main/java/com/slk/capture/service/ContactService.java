package com.slk.capture.service;

import java.util.List;

import com.slk.capture.model.Contact;

public interface ContactService {

	public Contact addContact(Long mobileNo,String emailId,Integer extension);

	public Contact getContact(Long graphID);
	
	public List<Contact> getAllContact();
	
	
}
