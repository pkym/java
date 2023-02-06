package javafestival02;

import java.util.Scanner;

public class ex09프로그램작성 {

	public static void main(String[] args) {
		// N과 X를 입력 받는다
		// N개의 정수를 입력 받는다
		// N개의 숫자 중 X보다 작은 수만 출력한다

		Scanner sc = new Scanner(System.in);
		System.out.print("N입력 >> ");
		int N = sc.nextInt();
		System.out.print("X입력 >> ");
		int X = sc.nextInt();

		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print((i + 1) + "번째 정수 입력>> ");
			int num = sc.nextInt();
			array[i] = num;
		}

		System.out.print("결과 >> ");
		for (int i = 0; i < N; i++) {
			if (array[i] < X) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
