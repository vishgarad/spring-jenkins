package com.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	 contextLoads() {
		logger.info("Test caase executing ");
		logger.info("Test caase executing second log statement ");
		assertEquals(false, false);
	}

}
