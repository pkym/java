package ex0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ex04selectall {

	public static void main(String[] args) {
		// 모든 회원의 아이디, 이름, 전화번호를 출력

		// sql = "select * from big_member"
		// 아이디 이름 전화번호 순으로 출력하기
		PreparedStatement psmt = null;
		Connection conn = null;
		ResultSet rs = null;

		try {
			// 2) driver 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 3) db 연결 통로 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			conn = DriverManager.getConnection(url, user_id, user_pw);

			// 4) sql문 준비
			String sql = "select * from big_member";

			// 5) sql문 실행 준비 상태 만들기
			psmt = conn.prepareStatement(sql);

			// 6) sql문 실행
		
			rs = psmt.executeQuery();

			// 7) 결과를 이용한 작업처리
	
			System.out.println("아이디\t이름\t전화번호\t");
			while (rs.next()) {

				String uid = rs.getString(1);
				String uname = rs.getString("name");
				String utel = rs.getString("tel");
				System.out.println(uid + "\t" + uname + "\t" + utel);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				// 8) 나중에 만들어진 것부터 사용했던 객체들 닫기
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}

}
