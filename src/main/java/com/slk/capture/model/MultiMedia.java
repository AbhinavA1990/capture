package com.slk.capture.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class MultiMedia {

	@GraphId
	private Long graphId;

	@Property(name = "contentType")
	private String contentType;

	@Property(name = "fileName")
	private String fileName;

	@Property(name = "content")
	private Byte[] content;

}
