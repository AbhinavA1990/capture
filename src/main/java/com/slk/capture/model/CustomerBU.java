package com.slk.capture.model;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class CustomerBU {

	@GraphId
	private Long graphId;

	@Property(name = "cbuId")
	private String cbuId;

	@Property(name = "mobileNo")
	private String cbuName;

	@Relationship(type = "CBUHEAD", direction = Relationship.OUTGOING)
	private Profile cbuHead;

	@Relationship(type = "PROFILES", direction = Relationship.OUTGOING)
	private List<Profile> profileList;

	@Property(name = "cbuType")
	private String cbuType;

	public CustomerBU() {
		// TODO Auto-generated constructor stub
	}

	public String getCbuName() {
		return cbuName;
	}

	public void setCbuName(String cbuName) {
		this.cbuName = cbuName;
	}

	public String getCbuType() {
		return cbuType;
	}

	public void setCbuType(String cbuType) {
		this.cbuType = cbuType;
	}

}
