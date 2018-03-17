package com.slk.capture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.BlogT;
import com.slk.capture.repo.BlogRepsository;

@Service
public class BlogTServiceImpl implements BlogTService {
	
	@Autowired
	private BlogRepsository blogRepository;

	@Override
	public BlogT addBlog(String blogTitle, String blogText) {
		  BlogT blog = new BlogT();
		  blog.setBlogTitle(blogTitle);
		  blog.setBlogText(blogText);
		  return blogRepository.save(blog);
	}

	@Override
	public BlogT getBlogT(Long graphId) {
		 return blogRepository.findOne(graphId);
	}

	@Override
	public List<BlogT> getAllBlogT() {
		 return (List<BlogT>) blogRepository.findAll(); 
	}
	
	
	

}
