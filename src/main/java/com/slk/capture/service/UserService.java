package com.slk.capture.service;

import java.util.List;

import com.slk.capture.model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void createUser(User user);
	
	public User addUser(String userName,String email,String password);
	
	 public User getUser(Long graphID);
	 
	 public List<User> getAllUser();

}
