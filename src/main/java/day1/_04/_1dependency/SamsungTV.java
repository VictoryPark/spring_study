package day1._04._1dependency;

import day1._02polymorphism.TV;

public class SamsungTV implements TV{

	//SamsungTV 클래스의 볼륨조절 기능을 SonySpeaker 가 하도록 수정..
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다..");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV ---전원 끈다...");
	}
	
	public void volumeUp() {
		//볼륨 올릴때마다 객체 생성..
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		//볼륨 내릴때마다 객체 생성..
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
} //end class
