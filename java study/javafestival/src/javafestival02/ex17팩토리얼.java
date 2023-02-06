package javafestival02;

public class ex17팩토리얼 {

	public static void main(String[] args) {
		// 1보다 큰 정수(N)을 입력하여 N! 값을 구하시오
		int num = 10;
		int sum = 1;
		System.out.println("입력: " + num);
		for (int i = 1; i <= num; i++) {
			sum *= i;

		}
		System.out.println("출력: " + sum);

	}

}
