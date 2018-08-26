package com.luv2code.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		// load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		// retrieve bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// call bean methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// close context
		context.close();
	}
}
