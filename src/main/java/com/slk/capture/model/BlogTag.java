package com.slk.capture.model;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class BlogTag {

	@GraphId
	private Long graphId;

	@Property(name = "blogType")
	private String blogTagName;

	@Relationship(type = "TAGBLOGS", direction = Relationship.OUTGOING)
	private List<BlogT> blogList;

	public String getBlogTagName() {
		return blogTagName;
	}

	public void setBlogTagName(String blogTagName) {
		this.blogTagName = blogTagName;
	}

	public List<BlogT> getBlogList() {
		return blogList;
	}

	public void setBlogList(List<BlogT> blogList) {
		this.blogList = blogList;
	}

}
