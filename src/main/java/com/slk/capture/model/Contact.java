package com.slk.capture.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class Contact {

	@GraphId
	private Long graphId;

//	@Property(name = "contactId")
//	private String contactId;

	@Property(name = "mobileNo")
	private Long mobileNo;

	@Property(name = "emailId")
	private String emailId;

	@Property(name = "extension")
	private Integer extension;

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	

	public Integer getExtension() {
		return extension;
	}

	public void setExtension(Integer extension) {
		this.extension = extension;
	}

	public Long getGraphId() {
		return graphId;
	}

	public void setGraphId(Long graphId) {
		this.graphId = graphId;
	}

//	public String getContactId() {
//		return contactId;
//	}
//
//	public void setContactId(String contactId) {
//		this.contactId = contactId;
//	}

}
