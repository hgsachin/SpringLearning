package com.training.springConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	private FortuneService fortuneService;
	
	public HockeyCoach() {
		System.out.println("HockeyCoach: Inside Constructor...");
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("HockeyCoach: Inside Setter method...");
		this.fortuneService = fortuneService;
	}

	/*
	 * @Autowired public HockeyCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
