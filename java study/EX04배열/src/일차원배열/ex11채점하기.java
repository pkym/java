package 일차원배열;

import java.util.Scanner;

public class ex11채점하기 {

	public static void main(String[] args) {
		// Q.채점하기

		Scanner sc = new Scanner(System.in);
		// 사용자가 입력한 답을 저장할 배열
		int[] input = new int[5];
		// 실제 정답을 저장하고 있는 배열
		int[] answer = { 1, 4, 3, 2, 1 };
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 답>> ");
			input[i] = sc.nextInt();
		}
		System.out.print("입력한 답은: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println("정답 확인");
		int sum=0;
		for (int i = 0; i < 5; i++) {
			if (answer[i] == input[i]) {
				System.out.print("O ");
				sum+=20;
			} else {
				System.out.print("X ");
			}
			
		}
		System.out.println("총점: "+sum);

	}

}
