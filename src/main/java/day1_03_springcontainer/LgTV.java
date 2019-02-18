package day1_03_springcontainer;

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
