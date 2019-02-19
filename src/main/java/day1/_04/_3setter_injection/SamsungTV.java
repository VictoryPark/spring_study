package day1._04._3setter_injection;

import day1._02polymorphism.TV;
import day1._04._2constructor_injection.Speaker;

public class SamsungTV implements TV{

	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다..(가격 : " + price +")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV ---전원 끈다...");
	}
	
	public void volumeUp() {
		//스피커는 생성자에서 정해버림..
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		//스피커는 생성자에서 정해버림..
		speaker.volumeDown();
	}
} //end class
