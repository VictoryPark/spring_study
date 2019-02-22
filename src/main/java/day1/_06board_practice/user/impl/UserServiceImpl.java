package day1._06board_practice.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day1._06board_practice.user.UserService;
import day1._06board_practice.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{

	//@Autowired 대신에 xml 설정으로 빈 객체 생성..
	@Autowired
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

}
