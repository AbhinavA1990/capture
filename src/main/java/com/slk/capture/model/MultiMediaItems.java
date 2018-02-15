package com.slk.capture.model;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Relationship;

public class MultiMediaItems extends PostType {

	@GraphId
	private Long graphId;

	@Relationship(type = "lISTOFMM", direction = Relationship.OUTGOING)
	private List<MultiMedia> listOfMM;

	public List<MultiMedia> getListOfMM() {
		return listOfMM;
	}

	public void setListOfMM(List<MultiMedia> listOfMM) {
		this.listOfMM = listOfMM;
	}

}
