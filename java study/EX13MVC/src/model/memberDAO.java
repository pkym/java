package model;
//데이터 부분은 모두 모델 패키지에 빼놓기

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class memberDAO {

	// DAO: data access object
	// 데이터(DB)에 접근하는 것을 돕는 객체
	// DB와 연결해서 insert delete update select 코드들의 모음
	// 메소드 형태로 코드 작성, 보통 sql 쿼리를 실행하고, 실행결과 리턴

	// 중복으로 정의해 두면 나중에 가져다 쓰기 편하다
	// 0. 중복선언되고 있는 변수들을 DAO의 필드로 만들자
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;

	// 0. 중복으로 작성되고 있는 코드들을 메소드로 빼주자
	// 1). 커넥션부분 -try catch예외사항을 처리할 의무를 부여
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 2)finally부분
	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 1.회원가입 메소드
	// 다른 클래스에서 쓸 것 이기 떄문에 public
	public int join(String id, String pw, String name, String tel) {
//		PreparedStatement psmt = null;
//		Connection conn = null;

		// 결과 담당은 메소드 안에 넣어두기
		int row = 0;
		// 메소드 안에서 try-catch정의해 줘서 try 밖에서 빼줘도 됌!!
		getConn();

		try {
			// 만들어 놓은 연결 메소드로 대체

//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user_id = "hr";
//			String user_pw = "hr";
//
//			conn = DriverManager.getConnection(url, user_id, user_pw);

			String sql = "insert into big_member Values(?,?,?,?)";

			// prepareStatement도 try-catch 안에 들어가 있어야함

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, tel);

			row = psmt.executeUpdate();

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();

//			try {
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
		}
		return row;
	}

	// =====================================================
	// 2. 로그인 메소드
	public memberDTO login(String id, String pw) {
//		PreparedStatement psmt = null;
//		Connection conn = null;
//		ResultSet rs = null;

		// return 해야하니 미리 써주기
		memberDTO dto = null;

		try {
			getConn();
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user_id = "hr";
//			String user_pw = "hr";
//			conn = DriverManager.getConnection(url, user_id, user_pw);

			String sql = "select * from big_member where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			// 행을 rs에 담아놓음
			// 리턴값이 4개 >> 회원이라는 데이터타입이 필요 memberDTO
			rs = psmt.executeQuery();
			if (rs.next()) {
				String uid = rs.getString(1);
				String upw = rs.getString(2);
				String uname = rs.getString("name");
				String utel = rs.getString("tel");

				// rs에 닮겨있는 data를 DTO에 옮기자
				dto = new memberDTO(uid, upw, uname, utel);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close();
//			try {
//				if (rs != null)
//					rs.close();
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}

		}
		return dto;

	}

	// =====================================================
	// 3. 전체 회원목록
	public ArrayList<memberDTO> selectAll() {
//		PreparedStatement psmt = null;
//		Connection conn = null;
//		ResultSet rs = null;

		// 반복문 안에 넣어버리면 list안이 계속 초기화됨
		ArrayList<memberDTO> list = new ArrayList<memberDTO>();

		try {
			getConn();

//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user_id = "hr";
//			String user_pw = "hr";
//			conn = DriverManager.getConnection(url, user_id, user_pw);

			String sql = "select * from big_member";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			// rs 닫는 순간 null의 값되 됨 >> 리턴값이 될 수 없는 이유

			while (rs.next()) {

				String uid = rs.getString(1);
				String uname = rs.getString("name");
				String utel = rs.getString("tel");

				memberDTO dto = new memberDTO();
				dto.setId(uid); dto.setPw(uname); dto.setTel(utel);
				// 한줄의 데이터를 바구니에 담기

				list.add(dto);
				// 가변 배열인 Arraylist에 dto를 누적해서 담기

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();

//			try {
//
//				if (rs != null)
//					rs.close();
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}

		}
		return list;
	}

	// =====================================================
	// 4. 회원정보수정
	// 매개변수 순서를 지켜야 하기 때문에 길게 나열하는 것은 좋은 방법이 아님
	// DTO로 다 빼주기
	public int update(memberDTO dto) {
//		PreparedStatement psmt = null;
//		Connection conn = null;
		int row = 0;

		try {
			getConn();
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user_id = "hr";
//			String user_pw = "hr";
//			conn = DriverManager.getConnection(url, user_id, user_pw);
			// 테이블에서 일치하는 행을 찾아서 수정

			String sql = "update big_member set name = ?, tel = ? where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTel());
			psmt.setString(3, dto.getId());
			psmt.setString(4, dto.getPw());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			close();
//			try {
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}

		}
		return row;

	}

	// =====================================================
	// 5. 회원탈퇴
	public int delete(memberDTO dto) {
//		PreparedStatement psmt = null;
//		Connection conn = null;
		int row = 0;
		//실패를 기점으로 값을 설정

		try {
			getConn();

//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user_id = "hr";
//			String user_pw = "hr";
//
//			conn = DriverManager.getConnection(url, user_id, user_pw);

			String sql = "delete from big_member where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			row = psmt.executeUpdate();

			
		}

		catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			close();
//			try {
//				if (psmt != null)
//					psmt.close();
//				if (conn != null)
//					conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
		}
		return row;

	}

}
