package com.training.springannotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"annotations-applicationContext.xml");
		FootballTeam team = context.getBean("theClub", FootballTeam.class);
		System.out.println(team.getTeamName());
		context.close();
	}
}
