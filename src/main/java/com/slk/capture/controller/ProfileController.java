package com.slk.capture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slk.capture.model.Profile;
import com.slk.capture.service.ProfileService;

@RestController
public class ProfileController {

	@Autowired
	ProfileService profileService;

	@RequestMapping(value = "/createProfile", method = RequestMethod.POST, headers = "Accept=application/json")
	public void createProfile(@RequestBody Profile profile) {
		profileService.createProfile(profile);

	}

}
