package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class quizDAO {

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

//1.  정답확인 메소드
	public quizDTO quizanswer(int num, int answer) {

		quizDTO dto = null;

		try {
			getConn();

			String sql = "select * from quiz where num = ? and answer = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.setInt(2, answer);

			rs = psmt.executeQuery();
			if (rs.next()) {
				int unum = rs.getInt(1);
				int uanswer = rs.getInt(3);
				
				dto = new quizDTO(unum, uanswer);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close();

		}
		return dto;

	}


	

// 2. 퀴즈 출력 메소드
	public ArrayList<quizDTO> quizprint(int num) {
		ArrayList<quizDTO> list = new ArrayList<quizDTO>();
		
		try {
			getConn();
			
			String sql = "select * from quiz where num=?";
			
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				
				String uquestion = rs.getString("question");
				int umark = rs.getInt("mark");
				
				quizDTO dto1 = new quizDTO();
				
				dto1.setQuestion(uquestion);
				dto1.setMark(umark);
				
				list.add(dto1);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
			
		}
		return list;
		
	}
}