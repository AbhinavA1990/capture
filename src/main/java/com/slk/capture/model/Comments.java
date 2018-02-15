package com.slk.capture.model;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Comments {

	@GraphId
	private Long graphId;

	@Relationship(type = "COMMENTEDBYPROFILE", direction = Relationship.OUTGOING)
	private Profile profile;

	@Relationship(type = "COMMENTSREPLY", direction = Relationship.OUTGOING)
	private List<Comments> commentsReply;

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<Comments> getCommentsReply() {
		return commentsReply;
	}

	public void setCommentsReply(List<Comments> commentsReply) {
		this.commentsReply = commentsReply;
	}

}
