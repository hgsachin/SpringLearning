package com.training.springConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public HockeyCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
