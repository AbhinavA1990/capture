package com.slk.capture.service;

import com.slk.capture.model.Profile;

public interface ProfileService {

	public void createProfile(Profile profile);

	public Profile findByProfileName(String profileName);

}
