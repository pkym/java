package while문;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// 문제. 로그인 프로그램

		String loginId = "guava";
		String loginPw = "1234";

		Scanner sc = new Scanner(System.in);

		System.out.println("---로그인 프로그램---");

		// 문제. 로그인 실패 시 에는 로그인에 성공할 때 까지 아이디와 비밀번호를 입력

		while (true) {

			System.out.print("아이디 입력: ");
			String id = sc.next();

			System.out.print("비밀번호 입력: ");
			String pw = sc.next();

			// 문자열끼리 비교 할때는 ==이 아닌 문자열.equals(비교값)을 사용한다.
			if (loginId.equals(id) && loginPw.equals(pw)) {
				System.out.println("로그인 성공");
				break;

			} else {
				System.out.println("로그인 실패");
			}

		}
	}
}
