package io.batenzar.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/api/v1/hello")
	public String helloApi() {
		return "Greetings from Spring Boot!";
	}

}