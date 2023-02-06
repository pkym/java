package do_while문;

import java.util.Random;
import java.util.Scanner;

public class ex04Plusgame {

	public static void main(String[] args) {
		// (난수생성) 두개의 숫자 랜덤으로 뽑기

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		// 랜덤넘버 변수 만들기
//		int testNum=r.nextInt(10)+1;  //바운더리 설정(0부터 9까지)+1
//		System.out.println(testNum);

		do {
			int num1 = r.nextInt(10) + 1; // 랜덤으로 출제될 수
			int num2 = r.nextInt(10) + 1;
			int result = num1 + num2; // 랜덤의 두수의 합을 저장할 변수

			System.out.print(num1 + "+" + num2 + "=");
			int answer = sc.nextInt(); // 사용자가 입력한 정답이 저장될 변수

			if (answer == result) {
				System.out.println("Success");

			} else {
				System.out.println("Fail");
				System.out.print("계속 하시겠습니까?>> Y/N ");
				String Q = sc.next();

				if (Q.equals("N")) {
					System.out.println("종료합니다.");
					break;
				}

			}

		} while (true);sc.close();
		

	}

}
