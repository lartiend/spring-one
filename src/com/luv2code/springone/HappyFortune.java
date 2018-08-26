package com.luv2code.springone;

public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
