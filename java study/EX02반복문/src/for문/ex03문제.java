package for문;

public class ex03문제 {

	public static void main(String[] args) {
		// Q1. 1-100까지 3의 배수를 가로로 출력
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

		// Q2. 1-100까지의 3의 배수이면서 5의 배수를 가로로 출력
		System.out.println();
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
