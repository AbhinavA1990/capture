package com.slk.capture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.Profile;
import com.slk.capture.repo.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public void createProfile(Profile profile) {
		profileRepository.save(profile);
	}

	@Override
	public Profile findByProfileName(String userDetails) {
		return profileRepository.findByProfileName(userDetails);
	}

}
