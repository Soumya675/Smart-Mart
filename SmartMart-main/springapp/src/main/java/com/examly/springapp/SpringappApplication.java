package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringappApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringappApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
		log.info("Application started successfully!");

		
	}

}
