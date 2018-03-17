package com.slk.capture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.graphaware.module.uuid.UuidConfiguration;
import com.graphaware.module.uuid.UuidModule;
import com.graphaware.runtime.GraphAwareRuntime;
import com.graphaware.runtime.GraphAwareRuntimeFactory;

@SpringBootApplication
@EnableTransactionManagement
@EnableNeo4jRepositories(basePackages = "com.slk.capture.repo")
@EnableAutoConfiguration(exclude={MultipartAutoConfiguration.class})	
public class CaptureApplication {

	@Bean(name = "bCryptPasswordEncoder")
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver() {
	    CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
	    multipartResolver.setMaxUploadSize(100000);
	    return multipartResolver;
	}

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(CaptureApplication.class, args);
		
		/*GraphDatabaseService database = new GraphDatabaseFactory().newEmbeddedDatabaseBuilder(pathToDb)
			    .loadPropertiesFromFile(this.getClass().getClassLoader().getResource("neo4j.properties").getPath())
			    .newGraphDatabase();
		GraphAwareRuntime runtime = GraphAwareRuntimeFactory.createRuntime(database);  //where database is an instance of GraphDatabaseService
		 UuidModule module = new UuidModule("UUIDM", UuidConfiguration.defaultConfiguration());
		 runtime.registerModule(module);
		 runtime.start();*/
		// TestService testService = app.getBean(TestService.class);
		// testService.test();
	}
}
