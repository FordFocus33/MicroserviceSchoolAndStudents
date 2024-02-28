package com.torres.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BuildMicroservicesSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildMicroservicesSchoolApplication.class, args);
	}

}
