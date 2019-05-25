package com.training.springdemo;

import com.training.springdemo.helpers.FortuneService;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;

	public FootballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 Min on Shooting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
