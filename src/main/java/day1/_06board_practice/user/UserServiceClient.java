package day1._06board_practice.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		//1. Spring 구동한다..
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("day1_06/applicationContext.xml");
		
		//2. 스프링 컨테이너로 부터 UserServiceImpl 객체를 lookup 한다..
		UserService userService = (UserService) container.getBean("userService");
		
		//로그인 기능 테스트..
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "님 환영합니다.");
		} else {
			System.out.println("로그인 실패");
		}
		
		//4. Spring 컨테이너를 종료한다.
		container.close();
	} //main
} // end class