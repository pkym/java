package ex0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03update {

	public static void main(String[] args) {
		// 회원정보수정

		// 1. id, pw, name, tel을 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("====회원정보수정====");
		System.out.print("ID입력: ");
		String id = sc.next();
		System.out.print("PW입력: ");
		String pw = sc.next();
		System.out.print("수정할 이름입력: ");
		String name = sc.next();
		System.out.print("수정할 Tel입력: ");
		String tel = sc.next();

		PreparedStatement psmt = null;
		Connection conn = null;

		// 2. 회원의 pw, name, tel를 수정

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			conn = DriverManager.getConnection(url, user_id, user_pw);
			// 테이블에서 일치하는 행을 찾아서 수정

			String sql = "update big_member set name = ?, tel = ? where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, tel);
			psmt.setString(3, id);
			psmt.setString(4, pw);

			int row = psmt.executeUpdate();
			if (row > 0) {
				System.out.println("회원정보 수정성공");

			} else {
				System.out.println("ID와 PW를 확인하세요");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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
