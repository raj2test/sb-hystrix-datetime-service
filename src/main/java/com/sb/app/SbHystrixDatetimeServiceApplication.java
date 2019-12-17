package com.sb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SbHystrixDatetimeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbHystrixDatetimeServiceApplication.class, args);
	}

}
