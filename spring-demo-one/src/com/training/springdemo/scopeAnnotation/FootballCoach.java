package com.training.springdemo.scopeAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FootballCoach implements Coach {

	//Init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("Football Coach inside doMyStartUpStuff");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice Free Kicks today...";
	}
	
	//Destroy Method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("Football Coach Inside doMyCleanUpStuff");
	}

}
