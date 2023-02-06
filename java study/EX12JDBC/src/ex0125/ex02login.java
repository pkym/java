package ex0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ex02login {

	public static void main(String[] args) {
		// 로그인 프로그램
		PreparedStatement psmt = null;
		Connection conn = null;
		ResultSet rs = null;

		// 1. id,pw 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("ID입력: ");
		String id = sc.next();
		System.out.print("PW입력: ");
		String pw = sc.next();

		// 2. id, pw가 DB에 저장된 정보와 일치하는지 체크

		// 1) try-catch 구문
		try {
			// 2) driver 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 3) db 연결 통로 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";
			conn = DriverManager.getConnection(url, user_id, user_pw);

			// 4) sql문 준비
			String sql = "select * from big_member where id = ? and pw = ?";

			// 5) sql문 실행 준비 상태 만들기
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			// 6) sql문 실행
			// executeUpdate(): insert,delete,update 에만 적용가능
			// >> 결과가 몇 행 변경일어났는지
			// executeQuery(): select문을 실행할 때만 사용
			// ResultSet 타입으로 리턴 (조회한 표 모양을 그대로 갖고 있음)
			// ResultSet로 역시 마지막에 닫아줘야함
			rs = psmt.executeQuery();

			// 7) 결과를 이용한 작업처리
			// ResultSet
			// 행을 가리키는 커서를 갖고 있다
			// 처음에는 열 이름을 가르킴.
			// rs.next(): 커서 한칸 내리면서 해당하는 행에
			// 데이터가 있으면 true 없으면 false 리턴
			// id: primary key 이므로 id같으면서 pw 같은 경우 한가지 유일>> 한칸만 내리면 됨
			if (rs.next()) {
				System.out.println("로그인 성공");
				// 커서가 가리키고 있는 행에서 데이터 꺼내기
				// rs.get...으로 숫자로 열순서(int)써서 꺼내거나 "컬럼이름"(String) 써서 꺼내기
				String uid = rs.getString(1);
				String upw = rs.getString(2);
				// 데이터 오버로딩, 대소문자는 상관없음
				String uname = rs.getString("name");
				String utel = rs.getString("tel");
				System.out.printf("%s님 환영합니다", uname);

			} else {
				System.out.println("로그인 실패");
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
