package 일차원배열;

import java.util.Scanner;

public class ex13회원가입로그인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] id = new String[3];// 회원들의 아이디가 저장될 변수
		String[] pw = new String[3];// 회원들의 비번이 저장될 변수

		// 최대로 가입가능한 회원수는 3명
		// 문제 입력받은 아이디와 비밀번호를 우 ㅣ의 배열 안에 넣어 회원가입 시키시오.

		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		// 현재 회원수를 저장하고 있는 변수

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("==회원가입==");

				if (cnt < 3) {
					System.out.print("아이디입력: ");
					id[cnt] = sc.next();
					System.out.print("비번입력: ");
					pw[cnt] = sc.next();
					System.out.println("가입성공");
					cnt++;
				} else {
					System.out.println("더이상 가입이 불가능합니다.");
				}

			} else if (num == 2) {
				System.out.println("==로그인==");
				System.out.print("아이디입력: ");
				String myid = sc.next();
				System.out.print("비번입력: ");
				String mypw = sc.next();
				boolean ischeck = true;

				for (int i = 0; i < 3; i++) {
					if (myid.equals(id[i]) && myid.equals(pw[i])) {
						System.out.println("로그인성공");
						ischeck = false;
					}
				}
				if (ischeck) {
					System.out.println("로그인실패");
					break;
				}

			} else if (num == 3) {
				System.out.println("프로그램이 종료되었습니다.");
				break;

			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}

	}

}
