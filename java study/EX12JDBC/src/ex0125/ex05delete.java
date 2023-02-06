package ex0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex05delete {

	public static void main(String[] args) {
		// 회원탈퇴기능
		// 아이디와 비번이 일치하는 경우에만

		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 ID입력: ");
		String id = sc.next();
		System.out.print("PW입력: ");
		String pw = sc.next();

		PreparedStatement psmt = null;
		Connection conn = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			conn = DriverManager.getConnection(url, user_id, user_pw);

			String sql = "delete from big_member where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("회원탈퇴 성공");

			} else {
				System.out.println("회원탈퇴 실패");

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
