package com.training.springdemo.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("com.training.springdemo.javaConfig")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	//Define a bean for fortuneService
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	// Define a bean for swimCoach and inject dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(happyFortuneService());
	}
}
