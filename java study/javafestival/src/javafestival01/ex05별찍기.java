package javafestival01;

import java.util.Scanner;

public class ex05별찍기 {

	public static void main(String[] args) {
		// 8개 행에 각각 행 수 입력받은 만큼 별찍기

		Scanner sc = new Scanner(System.in);
		System.out.printf("행 개수: ");
		int num = sc.nextInt();

		for (int j = 0; j < num; j++) {
			for (int i = 0; i < j + 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
