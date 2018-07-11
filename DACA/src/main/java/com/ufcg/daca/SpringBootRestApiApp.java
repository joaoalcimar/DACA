package com.ufcg.daca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.ufcg.daca"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class SpringBootRestApiApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApp.class, args);
	}
}
