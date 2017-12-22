package com.example.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimApp {

	public static void main(String[] args) {
		// Load spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		// Retrieve bean from container
		SwimCoach coach1 = (SwimCoach) context.getBean("swimCoach");
		System.out.println(coach1.getDailyWorkout() + "\n" + coach1.getFortune());
		System.out.println(coach1.getTeam() + "\n" + coach1.getEmail());
		// Do stuff
		
		// Close context
		context.close();
	}
	

}
