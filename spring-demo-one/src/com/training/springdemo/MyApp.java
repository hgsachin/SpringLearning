package com.training.springdemo;

public class MyApp {
	public static void main(String[] args) {
		Coach theCoach = new HockeyCoach();
		System.out.println(theCoach.getDailyWorkout());
	}
}
