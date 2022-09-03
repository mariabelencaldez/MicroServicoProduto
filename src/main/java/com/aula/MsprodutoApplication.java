package com.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsprodutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsprodutoApplication.class, args);
	}

}
