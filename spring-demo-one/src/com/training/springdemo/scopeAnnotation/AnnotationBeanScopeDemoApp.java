package com.training.springdemo.scopeAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-scopeAnnotation.xml");
		Coach theCoach = context.getBean("footballCoach", Coach.class);
		Coach anotherCoach = context.getBean("footballCoach", Coach.class);
		
		boolean res = theCoach == anotherCoach;
		
		System.out.println("Result : " + res);
		System.out.println("Memory Location of theCoach : " + theCoach);
		System.out.println("Memory Location of anotherCoach : " + anotherCoach);
		
		context.close();
	}

}
