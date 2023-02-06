package javafestival02;

import java.util.Scanner;

public class ex07오름차순정렬 {

	public static void main(String[] args) {
		// 5개의 정수를 입력받아 오름차순 정렬하여 출력하는 프로그램을 구현하시오
		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 수 입력: ");
			int num = sc.nextInt();
			array[i] = num;

		}
		int temp;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				if (array[j] < array[i]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;

				}
			}
		}

		System.out.println("정렬 후");
		for (int n : array) {
			System.out.print(n + " ");

		}

	}

}
