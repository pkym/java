package javafestival01;

import java.util.Scanner;

public class ex09정수입력반올림 {

	public static void main(String[] args) {
		// 정수를 입력받아 1의 자리에서 반올림 한 결과를 출력하시오

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		int num1 = num % 10;
		if (num > 5) {
			num += (10 - num1);
		} else if (num1 <= 5) {
			num -= num1;
		}

		System.out.printf("반올림 수: %d", num);

	}

}
