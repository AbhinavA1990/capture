package com.slk.capture.service;

import java.util.List;

import com.slk.capture.model.Advertisement;

public interface AdvertisementService {
	
	public Advertisement addAdvertisement(String productName,String productDescription, Double productPrice);
	
	 public Advertisement getAdvertisement(Long graphId);
	 
	 public List<Advertisement> getAllAdvertisement();

}
