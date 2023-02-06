package javafestival02;

import java.util.Scanner;

public class ex04십진수입력받아2진수변환 {

	public static void main(String[] args) {
		// 10진수 정수를 입력받아 2진수로 변환해서 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		int[] array = new int[32];
		int i = 0;

		while (num != 0) {
			array[i] = num % 2;
			num = num / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--) {
			System.out.print(array[j]);
		}

//		System.out.println("숫자입력>>");
//		int num = scanner.nextInt();
//
//		int i = 0;
//		int[] array = new int[32];
//		while (num > 0) {
//			array[i] = num % 2;
//			num = num / 2;
//			i++;
//		}
//		for (int j = i - 1; j >= 0; j--) {
//			System.out.print(array[j] + " ");
//		}

	}

}
