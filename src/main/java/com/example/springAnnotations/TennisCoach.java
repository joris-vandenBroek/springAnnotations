package com.example.springAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice forehand volley for 15 minutes";
	}

	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	// define init method
	@PostConstruct
	public void doSomeInitStuffHere() {
		System.out.println("Initttttttt");
	}

	// define destroy method
	@PreDestroy
	public void doSomeDestroyShitHere() {
		System.out.println("Destroyyyyyyyyyyy");
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
