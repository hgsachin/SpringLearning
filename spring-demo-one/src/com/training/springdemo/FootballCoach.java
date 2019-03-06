package com.training.springdemo;

public class FootballCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Spend 30 Min on Shooting practice";
	}
}
