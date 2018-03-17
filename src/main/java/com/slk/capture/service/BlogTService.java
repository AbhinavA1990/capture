package com.slk.capture.service;

import java.util.List;

import com.slk.capture.model.BlogT;

public interface BlogTService {
	
	public BlogT addBlog(String blogTitle,String blogText);
	
	 public BlogT getBlogT(Long graphId);
	 
	 public List<BlogT> getAllBlogT();

}
