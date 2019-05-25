package com.training.springdemo;

import com.training.springdemo.helpers.FortuneService;

public class ChessCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String style;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}

	public ChessCoach() {
		System.out.println("Inside Constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Think for 40 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
