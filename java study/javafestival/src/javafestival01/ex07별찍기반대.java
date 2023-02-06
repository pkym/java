package javafestival01;

import java.util.Scanner;

public class ex07별찍기반대 {

	public static void main(String[] args) {
		// 행갯수를 입력받아 역순으로 별찍으시오
		Scanner sc = new Scanner(System.in);
		System.out.print("행갯수: ");
		int num = sc.nextInt();

		for (int j = 0; j < num; j++) {
			for (int i = 8; i > j; i--) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
