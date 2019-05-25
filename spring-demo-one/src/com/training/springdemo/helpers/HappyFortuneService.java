package com.training.springdemo.helpers;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Time will turn";
	}

}
