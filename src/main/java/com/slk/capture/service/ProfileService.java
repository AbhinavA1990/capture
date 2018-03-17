package com.slk.capture.service;

import java.util.List;

import com.slk.capture.model.Profile;

public interface ProfileService {
	
	

	public Profile addProfile(String profileName,String workstation, String profileDesignation);

	public Profile findByProfileName(String profileName);
	
	public Profile getProfile(Long graphID);
	
	public List<Profile> getAllProfile();

}
