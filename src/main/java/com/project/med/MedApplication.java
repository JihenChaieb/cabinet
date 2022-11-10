package com.project.med;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories("com.project.med.Repository")
@SpringBootApplication
public class MedApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedApplication.class, args);
	}

}
