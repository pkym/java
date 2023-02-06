package do_while문;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// while로 만들었던 로그인 프로그램을
		// do-while로 변경해서 작성하시오.

		String loginId = "guava";
		String loginPw = "1234";

		Scanner sc = new Scanner(System.in);
		System.out.println("---로그인 프로그램---");

		do {
			System.out.print("아이디 입력: ");
			String id = sc.next();

			System.out.print("패스워드 입력: ");
			String pw = sc.next();

			if (loginId.equals(id) && loginPw.equals(pw)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패");
			}

		} while (true);sc.close();

	}

}
