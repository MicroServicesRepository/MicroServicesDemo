package com.demo.displayName;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DisplayNameApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayNameApplication.class, args);
	}
}
