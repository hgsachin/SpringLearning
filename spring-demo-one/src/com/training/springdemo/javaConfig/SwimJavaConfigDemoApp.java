package com.training.springdemo.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println("Random message of theCoach : " + theCoach.getRandomMsg());
		System.out.println("Properties: " + theCoach.getEmail() + " " + theCoach.getStyle());
		
		context.close();
	}

}
