package com.luv2code.springone;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		return "Baseball fortune: "+this.fortuneService.getFortune();
	}
}
