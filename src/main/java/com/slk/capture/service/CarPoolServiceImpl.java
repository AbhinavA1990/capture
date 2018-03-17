package com.slk.capture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.CarPool;
import com.slk.capture.repo.CarPoolRepository;

@Service
public class CarPoolServiceImpl implements CarPoolService {
	
	@Autowired
	private CarPoolRepository carPoolRepository;

	@Override
	public CarPool addCarPool(String destinationTo, String startFrom, String vehicleNumber, Integer seatsAvailable) {
		 CarPool carpool = new CarPool();
		   carpool.setStartFrom(startFrom);
		   carpool.setDestinationTo(destinationTo);
		   carpool.setVehicleNumber(vehicleNumber);
		   carpool.setSeatsAvailable(seatsAvailable);
		   return carPoolRepository.save(carpool);
	}

	@Override
	public CarPool getCarPool(Long graphId) {
		return carPoolRepository.findOne(graphId);
	}

	@Override
	public List<CarPool> getAllCarPool() {
		 return (List<CarPool>) carPoolRepository.findAll();
	}

}
