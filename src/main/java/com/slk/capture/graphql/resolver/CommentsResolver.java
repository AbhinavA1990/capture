package com.slk.capture.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.slk.capture.model.Comments;

public class CommentsResolver implements GraphQLResolver<Comments> {
	
	public Long getGraphId(Comments comments) {
		return comments.getGraphId();
	}

}
