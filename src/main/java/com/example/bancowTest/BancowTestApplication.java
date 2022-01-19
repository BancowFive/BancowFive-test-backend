package com.example.bancowTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BancowTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancowTestApplication.class, args);
	}

}
