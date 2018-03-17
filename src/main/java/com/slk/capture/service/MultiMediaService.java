package com.slk.capture.service;

import java.util.List;

import com.slk.capture.model.MultiMedia;

public interface MultiMediaService {
	
	public MultiMedia addMutliMedia(String contentType,String fileName);

	public MultiMedia getMultiMedia(Long graphId);
	
	 public List<MultiMedia> getAllMultiMedia();



}
