package com.challenge15.challenge15;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration
@SpringBootApplication
@OpenAPIDefinition
@EnableWebMvc
public class Challenge15Application {

	public static void main(String[] args) {
		SpringApplication.run(Challenge15Application.class, args);
	}

}
