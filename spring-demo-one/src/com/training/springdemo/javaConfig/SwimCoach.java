package com.training.springdemo.javaConfig;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;
	
	@Value("${style}")
	private String style;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getRandomMsg() {
		return fortuneService.getDailyFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getStyle() {
		return style;
	}

}
