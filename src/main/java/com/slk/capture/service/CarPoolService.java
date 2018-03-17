package com.slk.capture.service;

import java.util.List;

import com.slk.capture.model.CarPool;

public interface CarPoolService {
	
	public CarPool addCarPool(String destinationTo,String startFrom,String vehicleNumber,Integer seatsAvailable);

	public CarPool getCarPool(Long graphId);
	
	 public List<CarPool> getAllCarPool();
	
	
	
}
