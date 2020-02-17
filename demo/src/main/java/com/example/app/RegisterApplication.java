package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@AutoConfigurationPackage
@ComponentScan(basePackages = "com.example")
@EnableJpaRepositories(basePackages = "com.example.dao")
@EntityScan(basePackages = "com.example.model")
public class RegisterApplication {

	private static final Logger log = LoggerFactory.getLogger(RegisterApplication.class);

	public static void main(String[] args) {
		log.info("RegisterApplication :: main() : started successfully");
		SpringApplication.run(RegisterApplication.class, args);
	}

}
