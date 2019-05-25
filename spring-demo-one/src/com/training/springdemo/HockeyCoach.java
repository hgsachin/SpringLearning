package com.training.springdemo;

import com.training.springdemo.helpers.FortuneService;

public class HockeyCoach implements Coach {

	private FortuneService fortuneService;

	public HockeyCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 45 min on Hitting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("HockeyCoach : doMyStartupStuff method");
	}

	public void doMyDestroyStuff() {
		System.out.println("HockeyCoach : doMyDestroyStuff method");
	}

}
