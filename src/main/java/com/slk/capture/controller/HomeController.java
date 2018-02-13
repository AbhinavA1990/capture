package com.slk.capture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slk.capture.model.Profile;
import com.slk.capture.model.User;
import com.slk.capture.service.ProfileService;
import com.slk.capture.service.UserService;

@RestController
public class HomeController {

	@Autowired
	ProfileService profileService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/createProfile", method = RequestMethod.POST, headers = "Accept=application/json")
	public void createProfile(@RequestBody Profile profile) {
		profileService.createProfile(profile);

	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST, headers = "Accept=application/json")
	public void createUser(@RequestBody User user) {
		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists == null) {
			userService.createUser(user);
		}
	}

}
