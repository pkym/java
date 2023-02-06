package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import mvc.memberDTO;

public class memberDAO {

	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@gjaischool-b.ddns.net:1525:xe";
			String user_id = "cgi_3_0131_4";
			String user_pw = "smhrd4";

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
	public int join(String id, String pw, String name) {

		int row = 0;

		getConn();

		try {
			String sql = "insert into member Values(?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);

			row = psmt.executeUpdate();

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();

		}
		return row;
	}

	// =====================================================
	// 2. 로그인 메소드
	public memberDTO login(String id, String pw) {

		memberDTO dto = null;

		try {
			getConn();

			String sql = "select * from member where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();
			if (rs.next()) {
				String uid = rs.getString(1);
				String upw = rs.getString(2);
				String uname = rs.getString("name");

				// rs에 닮겨있는 data를 DTO에 옮기자
				dto = new memberDTO(uid, upw, uname);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close();

		}
		return dto;

	}


}
