package com.asesoftware.apprueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class AppruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppruebaApplication.class, args);
		System.out.println("Hola mundo.");
	}

}
