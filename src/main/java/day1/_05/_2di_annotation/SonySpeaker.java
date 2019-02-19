package day1._05._2di_annotation;

import org.springframework.stereotype.Component;

import day1._04._2constructor_injection.Speaker;

@Component("sony")
public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("SonySpeaker --- 소리 올린다.");
	}
	
	public void volumeDown() {
		System.out.println("SonySpeaker --- 소리 내린다.");
	}
} //end class
