package com.example.springAnnotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
	
	private String[] fortunes = {
			"Happy dayzzz", 
			"You get in shape fast", 
			"You are getting better and better"
	};
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		System.out.println("random int: " + index);
		return fortunes[index];
	}

}
