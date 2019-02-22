package day1._06board_practice.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import day1._06board_practice.common.JDBCUtil;
import day1._06board_practice.user.UserVO;

@Repository
public class UserDAO {

	//JDBC 관련 변수..
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	//SQL 명령어들..
	private final String USER_GET = "select * from users where id = ? and password = ?";

	//CRUD 기능의 메소드 구현..
	//회원 조회
	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		System.out.println("===> getUser() 기능 처리");
		
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		
		return user;
	} //getUSer
} //end class
