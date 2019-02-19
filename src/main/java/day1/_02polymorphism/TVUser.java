package day1._02polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		//1.spring 컨테이너를 구동한다..
		AbstractApplicationContext factory =
					new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
		/*TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();*/
		
		//applicationContext.xml 에서  scope을 prototype 으로 하면
		//매번 새로운 객체 생성..!
		TV tv1 = (TV) new SamsungTV();
		TV tv2 = (TV) new SamsungTV();
		TV tv3 = (TV) new SamsungTV();
		
		//3. Spring 컨테이너를 종료한다..
		factory.close();
		
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
//		LgTV tv = new LgTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
		
		//묵시적 형변환~
		//인터페이스를 이용한 느슨한 결
		/*TV tv = new SamsungTV2();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		tv = new LgTV2();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();*/
		
		//TVUser는 직접 객체를 생성하지 않고 BeanFActory에 필요한 객체를 요청한다..
		/*BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();*/
		
		
	} // main
} //end class
