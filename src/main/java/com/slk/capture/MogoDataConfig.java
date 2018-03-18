package com.slk.capture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
@EnableTransactionManagement
public class MogoDataConfig extends AbstractMongoConfiguration {

	@Bean
	public GridFsTemplate gridFsTemplate() throws Exception {
		return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
	}

	@Override
	protected String getDatabaseName() {
		return "Capture";
	}

	@Override
	public Mongo mongo() throws Exception {
		MongoClientURI uri = new MongoClientURI(
				"mongodb://Abhinavverma:IamLegend@capture-shard-00-00-qdxyu.mongodb.net:27017,"
					+ "capture-shard-00-01-qdxyu.mongodb.net:27017,capture-shard-00-02-qdxyu.mongodb.net:"
					+ "27017/test?ssl=true&replicaSet=Capture-shard-0&authSource=admin");
		return new MongoClient(uri);
	}
}
