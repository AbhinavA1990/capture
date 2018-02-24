package com.slk.capture.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.slk.capture.model.BlogT;

public class BlogTResolver implements GraphQLResolver<BlogT> {
	
	
	public Long getGraphId(BlogT blogt) {
		return blogt.getGraphId();
	}

}
