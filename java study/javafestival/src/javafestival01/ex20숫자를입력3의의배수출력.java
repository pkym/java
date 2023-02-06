package javafestival01;

import java.util.Scanner;

public class ex20숫자를입력3의의배수출력 {

	public static void main(String[] args) {
		// 숫자를 입력받아 3의 배수인 숫자르 출력하는 프로그램을 작성하세요

		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "번 째 정수 입력>>");
			array[i] = sc.nextInt();

		}
		System.out.print("3의 배수: ");
		for (int i = 0; i < 10; i++) {
			if (array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			}

		}

	}

}
