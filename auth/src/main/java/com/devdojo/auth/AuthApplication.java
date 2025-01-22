package com.devdojo.auth;

import com.devdojo.core.config.JwtConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.devdojo.core", "com.devdojo.auth"})
@EnableConfigurationProperties(value = JwtConfiguration.class)
@EntityScan({"com.devdojo.core.entities"})
@EnableJpaRepositories({"com.devdojo.core.repositories"})
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

}
