package com.training.springdemo.javaConfig;

import org.springframework.stereotype.Component;

@Component("F1Coach")
public class F1Coach implements Coach {

	@Override
	public String getRandomMsg() {
		return "This is just random message....";
	}

}
