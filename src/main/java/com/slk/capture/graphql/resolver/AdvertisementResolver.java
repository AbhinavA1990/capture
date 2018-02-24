package com.slk.capture.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.slk.capture.model.Advertisement;
import com.slk.capture.repo.AdvertisementRepository;

@Component
public class AdvertisementResolver implements GraphQLResolver<Advertisement> {

	@Autowired
	private AdvertisementRepository AdvertisementRepository;

	public Long getGraphId(Advertisement advertisment) {
		return advertisment.getGraphId();
	}
}
