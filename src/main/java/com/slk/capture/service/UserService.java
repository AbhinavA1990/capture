package com.slk.capture.service;

import com.slk.capture.model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void createUser(User user);

}
