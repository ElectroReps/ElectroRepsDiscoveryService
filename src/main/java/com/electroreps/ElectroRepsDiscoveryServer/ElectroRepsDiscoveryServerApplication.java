package com.electroreps.ElectroRepsDiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ElectroRepsDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectroRepsDiscoveryServerApplication.class, args);
	}

}
