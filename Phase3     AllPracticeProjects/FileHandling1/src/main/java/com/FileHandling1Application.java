package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.simplilearn.controller")
public class FileHandling1Application {

	public static void main(String[] args) {
		SpringApplication.run(FileHandling1Application.class, args);
	}

}
