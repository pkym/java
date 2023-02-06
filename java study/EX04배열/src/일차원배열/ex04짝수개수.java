package 일차원배열;

import java.util.Random;

public class ex04짝수개수 {

	public static void main(String[] args) {
		// 문제

		int[] array = new int[10];
		Random r = new Random();
		int even=0;

		System.out.print("array에 들어있는 짝수는 ");
		for (int i = 0; i < 10; i++) {
			array[i] = r.nextInt(100) + 1;
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
				even++;
			}
		}
		System.out.println("입니다");
		System.out.println("총 짝수의 갯수는"+even+"입니다");

	}

}
