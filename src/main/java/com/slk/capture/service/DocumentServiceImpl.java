package com.slk.capture.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFSDBFile;

@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private GridFsTemplate gridFsTemplate;
	
	@Override
	public void testMongo() {
		try {
			File file = new File("E:\\pic.jpg");
			String id = insertDocument(file, 10190L, "image/jpeg");
			
			File file2 = getDocument(id);
			System.out.println(file2.getName());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String insertDocument(File file, Long profile_id, String contentType) throws FileNotFoundException {
		DBObject metaData = new BasicDBObject();
		metaData.put("profile_id", profile_id);
		return gridFsTemplate.store(new FileInputStream(file), file.getName(), 
				contentType, metaData).getId().toString();
	}
	
	@Override
	public File getDocument(String id) throws IOException {
		GridFSDBFile gridFsdbFile = gridFsTemplate.findOne(new Query(Criteria.where("_id").is(id)));
		return getFileObject(gridFsdbFile);
	}
	
	@Override
	public List<File> getDocuments() throws IOException {
		List<GridFSDBFile> gridFsdbFiles = 
				  gridFsTemplate.find(new Query(Criteria.where("metadata.profile_id").is("alex")));
		List<File> filesList = new ArrayList<File>();
		for(GridFSDBFile gridFsdbFile : gridFsdbFiles) {
			filesList.add(getFileObject(gridFsdbFile));
		}
		return filesList;
	}
	
	private File getFileObject(GridFSDBFile gridFsdbFile) throws IOException {
		File file = new File(gridFsdbFile.getFilename());
		FileUtils.copyInputStreamToFile(gridFsdbFile.getInputStream(), file);
		return file;
	}
}
