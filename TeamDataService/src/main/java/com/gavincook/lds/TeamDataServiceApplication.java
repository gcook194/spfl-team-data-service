package com.gavincook.lds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TeamDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamDataServiceApplication.class, args);
	}

}
