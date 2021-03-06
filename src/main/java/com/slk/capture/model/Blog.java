package com.slk.capture.model;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Blog extends PostType {

	@GraphId
	private Long graphId;

	@Property(name = "blogType")
	private BlogType blogType;

	@Property(name = "blogTitle")
	private String blogTitle;

	@Property(name = "blogText")
	private String blogText;

	@Relationship(type = "BLOGMULTIMEDIA", direction = Relationship.OUTGOING)
	private List<MultiMedia> multiMediaList;

	@Relationship(type = "BLOGTAGS", direction = Relationship.OUTGOING)
	private List<BlogTag> blogTags;

	public BlogType getBlogType() {
		return blogType;
	}

	public void setBlogType(BlogType blogType) {
		this.blogType = blogType;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogText() {
		return blogText;
	}

	public void setBlogText(String blogText) {
		this.blogText = blogText;
	}

	public List<MultiMedia> getMultiMediaList() {
		return multiMediaList;
	}

	public void setMultiMediaList(List<MultiMedia> multiMediaList) {
		this.multiMediaList = multiMediaList;
	}

	public List<BlogTag> getBlogTags() {
		return blogTags;
	}

	public void setBlogTags(List<BlogTag> blogTags) {
		this.blogTags = blogTags;
	}

}
