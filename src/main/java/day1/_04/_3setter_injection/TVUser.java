package day1._04._3setter_injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import day1._02polymorphism.TV;

public class TVUser {

	public static void main(String[] args) {
		
		//1.spring 컨테이너를 구동한다..
		AbstractApplicationContext factory =
					new GenericXmlApplicationContext(
							"day1_04/applicationContext3.xml");
		
		//2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		//3. Spring 컨테이너를 종료한다..
		factory.close();
		
		
		
	} // main
} //end class
