package com.luv2code.springone;

import java.util.Random;

public class RandomFortune implements FortuneService {

	private String[] fortunesArray;

	public RandomFortune(String[] thefortunes) {
		System.out.println("RandomFortune is invoked.");
		this.fortunesArray = thefortunes;
	}
	
	@Override
	public String getFortune() {
		System.out.println("getFortune is invoked.");
		Random rand = new Random();
		int  n = rand.nextInt(this.fortunesArray.length);
		return this.fortunesArray[n];
	}

}
