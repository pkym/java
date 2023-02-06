package for문;

import java.util.Scanner;

public class ex04문제 {

	public static void main(String[] args) {
		// Q. 한개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하세요

		// 1.scanner추가
		Scanner sc = new Scanner(System.in);
		// 2.사용자로부터 정수를 하나 입력
		System.out.print("자연수를 입력하세요: ");
		// 3.그 정수를 변수에 저장
		int num = sc.nextInt();
		// 4. 출력
		for (int i = 1; i <= 10; i++) {
			System.out.print(num * i + " ");

		}
		sc.close();

	}

}
