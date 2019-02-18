package day1_03_springcontainer;

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
		TV tv1 = (TV) factory.getBean("tv");
		TV tv2 = (TV) factory.getBean("tv");
		TV tv3 = (TV) factory.getBean("tv");
		
		//3. Spring 컨테이너를 종료한다..
		factory.close();
		
		
		
	} // main
} //end class
