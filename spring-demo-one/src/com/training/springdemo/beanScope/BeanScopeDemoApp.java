package com.training.springdemo.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springdemo.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach otherCoach = context.getBean("myCoach", Coach.class);

		boolean result = theCoach == otherCoach;
		System.out.println(result);
		System.out.println(theCoach);
		System.out.println(otherCoach);
		context.close();
	}

}
