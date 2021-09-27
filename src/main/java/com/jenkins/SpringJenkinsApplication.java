package com.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void intt()
	{
		logger.info("application started ");
	}

	public static void main(String[] args) {
		
		logger.info("application ececuted  ");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
