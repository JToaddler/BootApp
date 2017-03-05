package com.madlabs.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootApplication
@WebAppConfiguration
public class BootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStarterApplication.class, args);
	}
}
