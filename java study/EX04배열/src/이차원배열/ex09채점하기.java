package 이차원배열;

import java.util.Scanner;

public class ex09채점하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[][] answer = { { 4, 5, 4, 1, 2 }, { 0, 0, 0, 0, 0 }, { 10, 20, 30, 20, 20 } };
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번쨰 답 >>");
			answer[1][i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < answer[0].length; i++) {
			if (answer[0][i] == answer[1][i]) {
				System.out.print("O\t");
				sum += answer[2][i];

			} else {
				System.out.print("X\t");
			}

		}
		System.out.println();
		System.out.println("총점:" + sum);

	}

}
