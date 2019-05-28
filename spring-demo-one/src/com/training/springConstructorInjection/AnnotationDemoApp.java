package com.training.springConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"constInjection-applicationContext.xml");
		Coach theCoach = context.getBean("hockeyCoach", Coach.class);
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
