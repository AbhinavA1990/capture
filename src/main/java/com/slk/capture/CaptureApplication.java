package com.slk.capture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.slk.capture.service.TestService;

@SpringBootApplication
@EnableTransactionManagement
@EnableNeo4jRepositories(basePackages = "com.slk.capture.repo")
public class CaptureApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(CaptureApplication.class, args);
		TestService testService = app.getBean(TestService.class);
		testService.test();
	}
}
