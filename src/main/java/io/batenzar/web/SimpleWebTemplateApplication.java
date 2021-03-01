package io.batenzar.web;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleWebTemplateApplication {

	public static void main(String[] args) {
		LogManager.getLogger().info("Test Log");
		SpringApplication.run(SimpleWebTemplateApplication.class, args);
	}

}
