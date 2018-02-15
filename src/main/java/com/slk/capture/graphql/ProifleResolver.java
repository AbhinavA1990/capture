package com.slk.capture.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.slk.capture.model.Profile;
import com.slk.capture.repo.ProfileRepository;

@Component
public class ProifleResolver implements GraphQLResolver<Profile> {
	
	
	@Autowired
	private ProfileRepository profileRepository;

	public Long getGraphId(Profile profile) {
		return profile.getGraphId();
	}

	public String getSkillId(Profile profile) {
		return profile.getProfileId();
	}

	
}