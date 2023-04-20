package com.Arunima.HelloWorldApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldAppApplication {
	@GetMapping("/home")
	public String getMessage() {
		return "HelloWorld..!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldAppApplication.class, args);
	}

}
