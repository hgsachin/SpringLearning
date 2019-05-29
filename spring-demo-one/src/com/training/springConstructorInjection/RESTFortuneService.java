package com.training.springConstructorInjection;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "REST is so cooool...";
	}

}
