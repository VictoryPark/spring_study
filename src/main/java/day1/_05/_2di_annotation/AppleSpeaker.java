package day1._05._2di_annotation;

import org.springframework.stereotype.Component;

import day1._04._2constructor_injection.Speaker;

@Component("apple")
public class AppleSpeaker implements Speaker{
	
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("AppleSpeaker --- 소리 올린다.");
	}

	public void volumeDown() {
		System.out.println("AppleSpeaker --- 소리 내린다.");
	}

} //end class
