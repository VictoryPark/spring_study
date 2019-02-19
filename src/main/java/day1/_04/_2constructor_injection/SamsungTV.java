package day1._04._2constructor_injection;

import day1._02polymorphism.TV;
import day1._04._2constructor_injection.SonySpeaker;

public class SamsungTV implements TV{

//	private SonySpeaker speaker;
	//인터페이스 타입으로 멤버필드 타입 변경~
	private Speaker speaker;
	//생성자 인젝션시, 매개변수가 여러개 일때...
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	
	/*public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}*/
	
	//인터페이스 타입으로 매개변수 타입 수정...
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
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
