package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class logDAO {
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

// 1. 내 점수 보기
	public ArrayList<logDTO> selectID(String id) {

		ArrayList<logDTO> list = new ArrayList<logDTO>();

		try {
			getConn();

			String sql = "select * from log where id=?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String unum = rs.getString("num");
				String uid = rs.getString("id");
				String umark = rs.getString("mark");
				String umod = rs.getString("mod");
				String utime = rs.getString("time");

				logDTO dto1 = new logDTO();

				dto1.setNum(unum);
				dto1.setId(uid);
				dto1.setMark(umark);
				dto1.setMod(umod);
				dto1.setTime(utime);

				list.add(dto1);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();

		}
		return list;
	}

	// 2. 기록 저장 하기

	public int insertLog(String id, int mark, String mod) {

		int row = 0;

		getConn();

		try {
			String sql = "insert into log values(LOG_SEQUENCE.nextval,?,?,?,sysdate)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setInt(2, mark);
			psmt.setString(3, mod);

			row = psmt.executeUpdate();

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();

		}
		return row;
	}

}
