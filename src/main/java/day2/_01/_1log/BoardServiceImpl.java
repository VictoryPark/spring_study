package day2._01._1log;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day2._01._1log.BoardService;
import day2._01._1log.BoardVO;
import day2._01._1log.BoardDAO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	//private LogAdvice log;
	private Log4jAdvice log;
	
	public BoardServiceImpl() {
		log = new Log4jAdvice();
	}	//생성자..
	
	@Override
	public void insertBoard(BoardVO vo) {
		//log.printLog();
		log.printLogging();
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		//log.printLog();
		log.printLogging();
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		//log.printLog();
		log.printLogging();
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		//log.printLog();
		log.printLogging();
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		//log.printLog();
		log.printLogging();
		return boardDAO.getBoardList(vo);
	}

}
