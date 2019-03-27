package day2._02._1aop;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import day2._02._1aop.BoardService;
import day2._02._1aop.BoardVO;

public class BoardServiceClient {

	public static void main(String[] args) {
		//1. Spring 구동한다..
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("day2_02/applicationContext.xml");
		
		//2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup 한다...
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		//3. 글 등록 테스트..
		BoardVO vo = new BoardVO();
		vo.setTitle("임시 제목");
		vo.setWriter("홍길동");
		vo.setContent("임시 내용......");
		boardService.insertBoard(vo);
		
		//4. 글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		//5. Spring 컨테이너 종료
		container.close();
	} //main
} // end class
