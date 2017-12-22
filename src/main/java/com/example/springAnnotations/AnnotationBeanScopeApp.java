package com.example.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		// Load spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		// Retrieve bean from container
		Coach coach1 = (Coach) context.getBean("tennisCoach");
		Coach coach2 = (Coach) context.getBean("tennisCoach");
		
		boolean same = (coach1 == coach2);
		System.out.println("Same: " + same);
		
		// Do stuff
		
		// Close context
		context.close();
	}
	

}
