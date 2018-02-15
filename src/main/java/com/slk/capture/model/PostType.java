package com.slk.capture.model;

import java.util.List;

import org.neo4j.ogm.annotation.Relationship;

public abstract class PostType {

	@Relationship(type = "POSTCOMMENTS", direction = Relationship.OUTGOING)
	private List<Comments> comments;

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

}
