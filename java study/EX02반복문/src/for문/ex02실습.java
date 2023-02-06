package for문;

public class ex02실습 {

	public static void main(String[] args) {
		// Q1. 21부터 57까지 가로로 출력
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		// Q2. 96에서 53까지 가로로출력
		for (int i = 53; i <= 96; i++) {
			System.out.print(149 - i + " ");
		}

		System.out.println();
		// Q3. 22에서 57까지 홀수만 가로로 출력
		for (int i = 22; i <= 57; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}

	}

}
