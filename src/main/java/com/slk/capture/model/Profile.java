package com.slk.capture.model;

import java.util.List;
import java.util.Set;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Profile {

	@GraphId
	private Long graphId;

	@Property(name = "profileName")
	private String profileName;

	@Relationship(type = "CONTACT", direction = Relationship.OUTGOING)
	private Contact profileContact;

	@Property(name = "workstation")
	private String workstation;

	@Relationship(type = "CBU")
	private CustomerBU cbu;

	@Property(name = "profileDesignation")
	private String profileDesignation;

	@Relationship(type = "SKILLS")
	private List<Skill> skills;

	@Property(name = "profilePic")
	private Byte[] profilePic;

	@Relationship(type = "PROFILEBLOGS", direction = Relationship.OUTGOING)
	private Set<Blog> blogs;

	public CustomerBU getCbu() {
		return cbu;
	}

	public void setCbu(CustomerBU cbu) {
		this.cbu = cbu;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public Set<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(Set<Blog> blogs) {
		this.blogs = blogs;
	}

	public Profile() {
		// TODO Auto-generated constructor stub
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public Contact getProfileContact() {
		return profileContact;
	}

	public void setProfileContact(Contact profileContact) {
		this.profileContact = profileContact;
	}

	public String getWorkstation() {
		return workstation;
	}

	public void setWorkstation(String workstation) {
		this.workstation = workstation;
	}

	public String getProfileDesignation() {
		return profileDesignation;
	}

	public void setProfileDesignation(String profileDesignation) {
		this.profileDesignation = profileDesignation;
	}

	public Byte[] getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(Byte[] profilePic) {
		this.profilePic = profilePic;
	}

}
