package day1._03springcontainer;

import day1._02polymorphism.TV;

public class LgTV implements TV{

	public void powerOn() {
		System.out.println("LgTV --- 전원 켠다..");	
	}

	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다..");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV --- 소리 올린다..");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV --- 소리 내린다..");
	}
} //end class
