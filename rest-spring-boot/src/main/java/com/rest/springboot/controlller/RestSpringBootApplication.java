package com.rest.springboot.controlller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@ComponentScan(basePackages = "com.rest.springboot")
@EnableJpaRepositories("com.rest.springboot.repository")
@EnableSwagger2
@EntityScan("com.rest.springboot.entity")
public class RestSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSpringBootApplication.class, args);
	}

}

