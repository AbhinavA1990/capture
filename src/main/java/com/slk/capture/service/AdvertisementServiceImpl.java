package com.slk.capture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.Advertisement;
import com.slk.capture.repo.AdvertisementRepository;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {
	
	@Autowired
	private AdvertisementRepository advertisementRepository;

	@Override
	public Advertisement addAdvertisement(String productName, String productDescription, Double productPrice) {
		Advertisement advertisement = new Advertisement();
		   advertisement.setProductName(productName);
		   advertisement.setProductDescription(productDescription);
		   advertisement.setProductPrice(productPrice);
		   return advertisementRepository.save(advertisement);	
	}

	@Override
	public Advertisement getAdvertisement(Long graphId) {
		return advertisementRepository.findOne(graphId);
	}

	@Override
	public List<Advertisement> getAllAdvertisement() {
		 return (List<Advertisement>) advertisementRepository.findAll();
	}

}
