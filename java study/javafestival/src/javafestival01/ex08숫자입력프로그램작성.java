package javafestival01;

import java.util.Scanner;

public class ex08숫자입력프로그램작성 {

	public static void main(String[] args) {
		// A와 B에 숫자를 입력받아 출력하고
		// 결과를 출력한다
		// A와 B가 모두 0을 입력 받으면 프로그램이 종료된다.

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("A 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			int num2 = sc.nextInt();
			int num = num1 - num2;

			if (num1 == 0 && num2 == 0) {
				break;
			}else {
				System.out.print("결과 >> ");
				System.out.print(num);				
			}
			System.out.println();
		}

	}

}
