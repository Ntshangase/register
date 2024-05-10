package com.mntwana.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000/")
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

	@GetMapping("/users")
	public String Display() {

		// instantiate object
		Students student = new Students("Simphiwe", "Ntshangase","ICT", 3576);

		// map objects with key:value pairs.
		//ObjectMapping mapping = new ObjectMapping();

		return "hey";
	}

	public static void main(String[] args) {
		SpringApplication.run(RegisterApplication.class, args);
	}

}
