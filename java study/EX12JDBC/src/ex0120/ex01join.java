package ex0120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01join {

	public static void main(String[] args) {

		// 사용자한테 id, pw, name, tel 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("ID입력: ");		String id = sc.next();
		System.out.print("PW입력: ");		String pw = sc.next();
		System.out.print("이름입력: ");	String name = sc.next();
		System.out.print("Tel입력: ");	String tel = sc.next();

		// JDBC
		// runtime error: 실행 중 발생하는 오류(문법적 오류는 X)--> 예외처리 필요
		// syntax error: 문법 자체 에러
		// try-catch: 예외상황 발생시 처리해주는 예외처리 구문
		// 예외상황이 발생하더라도 실행을 멈추지 않음
		// try문 안에 있는 코드를 실행
		// 만약 예외상황이 발생한다면 실행을 멈추고 catch문을 실행
		PreparedStatement psmt = null;  //레퍼런스 타입이므로 기본값
		Connection conn =null;

		try {
			// 1. 드라이버 동적 로딩(데이터베이스 종류결정)
			// 동적 로딩이란..?
			// : 실행하는 순간에 자료형을 결정하는 것
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB 연결 통로를 열어주는 작업
			// url, userid, pw 필요
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user_id = "hr";
			String user_pw = "hr";

			// 2. 문을 여는 도구 필요
			// connection이라는 객체 (메소드처럼 생겼지만)
			conn = DriverManager.getConnection(url, user_id, user_pw);

			// 3. sql문 준비
			// 회원가입 >> big_member 테이블에 데이터 추가
			// insert 구문
			String sql = "insert into big_member Values(?,?,?,?)";

			// ? 인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를 때 사용
			// : 지정한 데이터 공간만큼 비워놓고 실행하기 전까지 대기

			// 4. sql 문 전송(실행)
			// 쿼리문도 일정한 틀에 맞춰 보내줘야함
			// prepareStatement 라는 형식에다가 맞춰서
			psmt = conn.prepareStatement(sql);
			// --->전송하기 전에 sql문을 담아서 보낼 수 있는 형식으로 변경

			// 데이터바인등 작업(?인자 채우는) 진행(!!반드시 실행 전에 진행할 것!!!)
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, tel);

			// 반드시 물음표 인자를 전부 채워준 후에 실행해야 한다!!
			// DML 문에서만 업데이트메소드를 통해 실행
			// 리턴타입: 정수 --> 몇 행이 바뀌었는지 알려주는
			int row = psmt.executeUpdate();

			// 5. 결과를 이용해 작업처리
			// 사용자에게 어떤 결과를 보여줄지 정의

			if (row > 0) {
				System.out.println("회원가입 성공");

			} else {
				System.out.println("회원가입 실패");

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 위에서 예외상황이 발생하더라도 반드시 한번은 들어오는 구간
			// 6. DB 연결 종료 --> 자원반납 먼저 (자원보낸 순서와 반대로)
			try {
				if(psmt!=null)
				psmt.close();
				if(conn!=null)			
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// } catch (ClassNotFoundException e) {
// 예외상황 발생시 내용을 출력해준다
//			e.printStackTrace();
//		} catch (SQLException e) {
// SQL exception을 잡는가
//			e.printStackTrace();
//
//		}

	}

}
