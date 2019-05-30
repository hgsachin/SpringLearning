package com.training.springdemo.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach = context.getBean("F1Coach", Coach.class);
		
		System.out.println("Random message of theCoach : " + theCoach.getRandomMsg());
		
		context.close();
	}

}
