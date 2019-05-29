package com.training.springConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	public HockeyCoach() {
		System.out.println("HockeyCoach: Inside Constructor...");
	}

	// Setter Injection
	// @Autowired
	/*
	 * public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("HockeyCoach: Inside Setter method...");
	 * this.fortuneService = fortuneService; }
	 */
	
	// Method Injection
	/* @Autowired public void notASetterFortuneService(FortuneService
	 * fortuneService) {
	 * System.out.println("HockeyCoach: Inside notASetterFortuneService method...");
	 * this.fortuneService = fortuneService; }
	 */

	/*
	 * Constructor Injection
	 * @Autowired public HockeyCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
