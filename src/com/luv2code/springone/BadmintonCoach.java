package com.luv2code.springone;

public class BadmintonCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BadmintonCoach(FortuneService theFortuneService) {
		System.out.println("BadmintonCoach is invoked.");
		this.fortuneService = theFortuneService;
	}
		
	@Override
	public String getDailyWorkout() {
		return "Practice shuttlecock smash!";
	}

	@Override
	public String getDailyFortune() {
		return "Badminton fortune: "+this.fortuneService.getFortune();
	}
	
}
