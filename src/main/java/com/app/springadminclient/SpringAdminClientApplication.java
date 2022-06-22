package com.app.springadminclient;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAdminClientApplication {
	
	
private static final Logger log = LoggerFactory.getLogger(SpringAdminClientApplication.class);	
	
	@GetMapping("/helloworld")
	public String getMessage() {
		log.trace("This is a TRACE level message");
        log.debug("This is a DEBUG level message");
        log.info("This is an INFO level message");
        log.warn("This is a WARN level message");
        log.error("This is an ERROR level message");
		return "Spring boot admin client Demo ";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAdminClientApplication.class, args);
		
		
	}
}
