package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.simplilearn")

public class MicroServiceone1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceone1Application.class, args);
	}

}
