package com.slk.capture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.Profile;
import com.slk.capture.repo.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository profileRepository;

	
	@Override
	public Profile addProfile(String profileName, String workstation, String profileDesignation) {
		 Profile profile = new Profile();
	     profile.setProfileName(profileName);
	     profile.setWorkstation(workstation);
	     profile.setProfileDesignation(profileDesignation);
	     return profileRepository.save(profile);
	
	}


	@Override
	public Profile findByProfileName(String userDetails) {
		return profileRepository.findByProfileName(userDetails);
	}


	@Override
	public Profile getProfile(Long graphID) {
		return profileRepository.findOne(graphID);
	}


	@Override
	public List<Profile> getAllProfile() {
		return (List<Profile>) profileRepository.findAll();
	}





}
