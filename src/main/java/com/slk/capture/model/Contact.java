package com.slk.capture.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class Contact {

	@GraphId
	private Long graphId;

	@Property(name = "contactId")
	private String contactId;

	@Property(name = "mobileNo")
	private long mobileNo;

	@Property(name = "emailId")
	private String emailId;

	@Property(name = "extn")
	private int extn;

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getExtn() {
		return extn;
	}

	public void setExtn(int extn) {
		this.extn = extn;
	}

}
