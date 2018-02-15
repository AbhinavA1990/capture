package com.slk.capture.model;

import java.util.Date;
import java.util.Set;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class CarPool extends PostType {

	@GraphId
	private Long graphId;

	@Property(name = "dateTimeOfTravel")
	private Date dateTimeOfTravel;

	@Property(name = "destinationTo")
	private String destinationTo;

	@Property(name = "startFrom")
	private String startFrom;

	@Property(name = "vehicleNumber")
	private String vehicleNumber;

	@Property(name = "seatsAvailable")
	private Integer seatsAvailable;

	@Relationship(type = "INTERESTEDPROFILES", direction = Relationship.OUTGOING)
	private Set<Profile> interestedProfiles;

	public Date getDateTimeOfTravel() {
		return dateTimeOfTravel;
	}

	public void setDateTimeOfTravel(Date dateTimeOfTravel) {
		this.dateTimeOfTravel = dateTimeOfTravel;
	}

	public String getDestinationTo() {
		return destinationTo;
	}

	public void setDestinationTo(String destinationTo) {
		this.destinationTo = destinationTo;
	}

	public String getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(String startFrom) {
		this.startFrom = startFrom;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Integer getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(Integer seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public Set<Profile> getInterestedProfiles() {
		return interestedProfiles;
	}

	public void setInterestedProfiles(Set<Profile> interestedProfiles) {
		this.interestedProfiles = interestedProfiles;
	}

}
