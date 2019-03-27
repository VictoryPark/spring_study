package day2._02._1aop;

import java.util.List;

import day2._02._1aop.BoardVO;

public interface BoardService {

	//CRUD 기능의 메소드 구현..
	//글 등록..
	void insertBoard(BoardVO vo); //insert

	void updateBoard(BoardVO vo); // update

	void deleteBoard(BoardVO vo); // delete

	BoardVO getBoard(BoardVO vo); // detail

	List<BoardVO> getBoardList(BoardVO vo); // boardList

}