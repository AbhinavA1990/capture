package com.slk.capture.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface DocumentService {

	String insertDocument(File file, Long profile_id, String contentType) throws FileNotFoundException;

	File getDocument(String id) throws IOException;

	List<File> getDocuments() throws IOException;

	void testMongo();

}
