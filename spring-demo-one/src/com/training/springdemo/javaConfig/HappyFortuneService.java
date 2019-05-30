package com.training.springdemo.javaConfig;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Happy Fortune to you....";
	}

}
