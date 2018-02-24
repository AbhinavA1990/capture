package com.slk.capture.model;

import java.util.ArrayList;
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
	
	private String comment;

	@Relationship(type = "COMMENTSREPLY", direction = Relationship.OUTGOING)
	private List<Comments> commentsReply = new ArrayList<Comments>();

	public List<Comments> getCommentsReply() {
		return commentsReply;
	}

	public void setCommentsReply(List<Comments> commentsReply) {
		this.commentsReply = commentsReply;
	}
	public void addcomment(Comments comments) {
		commentsReply.add(comments);
	}
	
	public Long getGraphId() {
		return graphId;
	}

	public void setGraphId(Long graphId) {
		this.graphId = graphId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
