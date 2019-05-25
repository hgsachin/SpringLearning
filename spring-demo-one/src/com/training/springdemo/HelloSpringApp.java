package com.training.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println("Daily Workout : " + theCoach.getDailyWorkout());
		System.out.println("Daily Fortune : " + theCoach.getDailyFortune());
		context.close();
	}

}
