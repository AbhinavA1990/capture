package com.slk.capture.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Post {

	@GraphId
	private Long graphId;

	@Relationship(type = "POSTPROFILE", direction = Relationship.OUTGOING)
	private Profile profile;

	@Relationship(type = "POSTTYPE", direction = Relationship.OUTGOING)
	private PostType postType;

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public PostType getPostType() {
		return postType;
	}

	public void setPostType(PostType postType) {
		this.postType = postType;
	}

}
