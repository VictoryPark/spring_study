package day1._06board_practice.board;

import java.util.List;

import day1._06board_practice.board.BoardVO;

public interface BoardService {

	//CRUD 기능의 메소드 구현..
	//글 등록..
	void insertBoard(BoardVO vo); //insert

	void updateBoard(BoardVO vo); // update

	void deleteBoard(BoardVO vo); // delete

	BoardVO getBoard(BoardVO vo); // detail

	List<BoardVO> getBoardList(BoardVO vo); // boardList

}