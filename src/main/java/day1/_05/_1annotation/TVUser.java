package day1._05._1annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import day1._02polymorphism.TV;

public class TVUser {

	public static void main(String[] args) {
		
		//1.spring 컨테이너를 구동한다..
		AbstractApplicationContext factory =
					new GenericXmlApplicationContext(
							"day1_05/applicationContext.xml");
		
		//2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
//		TV tv = (TV) factory.getBean("tv");
		//만약 @Component 옆에 id를 지정하지 않았다면, 클래스 첫글자를 소문자로 바꾸고 부르면된다.
		TV tv = (TV) factory.getBean("lgTV");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		//3. Spring 컨테이너를 종료한다..
		factory.close();
		
		
		
	} // main
} //end class
