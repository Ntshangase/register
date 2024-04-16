package com.mntwana.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RegisterApplication {

	@GetMapping("/")
	public String onStart() {
		return "Welcome to my Spring-boot Application";
	}

	@GetMapping("/home")
	public String Greet() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(RegisterApplication.class, args);
	}

}
