package day1._05._2di_annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import day1._02polymorphism.TV;
import day1._04._2constructor_injection.Speaker;

@Component("tv")
public class LgTV implements TV{
	
	/*//Speaker 인터페이스를 상속받는 클래스에 Component 가 있으면 그것을 받는다..
	//Component("sony")가 메모리에 빈 객체로 있기 때문에 찾는다.
	@Autowired
	//Speaker 인터페이스를 상속받는 클래스가 여러개 있으면...Qulifier로 구별해줌
	@Qualifier("apple")*/
	
	//Autowired + Qualifier 의 기능을 합친 어노테이션... 
	@Resource(name="apple")
	private Speaker speaker;

	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}

	public void powerOn() {
		System.out.println("LgTV --- 전원 켠다..");
	}

	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다..");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
} //end class
