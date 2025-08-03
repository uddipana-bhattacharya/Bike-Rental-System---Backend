package com.rental.bike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikeApplication.class, args);
	}

	@GetMapping("/hi")
	public String hello() {
		return "Hello World! Bike Rental System is running successfully!";
	}

	@GetMapping("/")
	public String home() {
		return "Welcome to Bike Rental System API";
	}

}
