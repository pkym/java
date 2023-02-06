package for문;

import java.util.Scanner;

public class ex07기본별찍기 {

	public static void main(String[] args) {
		// 사용자로부터 정수를 입력받아
		// 입력받은 수 만큼 별 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.print("*");
		}
		sc.close();

	}

}
