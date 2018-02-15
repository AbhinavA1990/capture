package com.slk.capture.model;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Advertisement extends PostType {

	@GraphId
	private Long graphId;

	@Property(name = "productName")
	private String productName;

	@Property(name = "productDescription")
	private String productDescription;

	@Property(name = "productPrice")
	private Double productPrice;

	@Relationship(type = "INTERESTEDPROFILES", direction = Relationship.OUTGOING)
	private List<Profile> interestedProfiles;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public List<Profile> getInterestedProfiles() {
		return interestedProfiles;
	}

	public void setInterestedProfiles(List<Profile> interestedProfiles) {
		this.interestedProfiles = interestedProfiles;
	}

}
