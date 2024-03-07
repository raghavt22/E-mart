package com.emart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.emart.*")
@EntityScan(basePackages="com.emart.*")
@EnableJpaRepositories(basePackages="com.emart.*")
public class EmartApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmartApplication.class, args);
	}

}
