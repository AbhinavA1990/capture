package com.slk.capture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.MultiMedia;
import com.slk.capture.repo.MultiMediaRepository;

@Service
public class MultiMediaServiceImpl implements MultiMediaService {
	
	@Autowired
	private MultiMediaRepository mutliMediaRepository;

	@Override
	public MultiMedia addMutliMedia(String contentType, String fileName) {
		 MultiMedia multimedia = new MultiMedia();
		  multimedia.setFileName(fileName);
	      multimedia.setContentType(contentType);
	      return mutliMediaRepository.save(multimedia);
	}

	@Override
	public MultiMedia getMultiMedia(Long graphId) {
		 return mutliMediaRepository.findOne(graphId);
	}

	@Override
	public List<MultiMedia> getAllMultiMedia() {
		 return (List<MultiMedia>) mutliMediaRepository.findAll();
	}

}
