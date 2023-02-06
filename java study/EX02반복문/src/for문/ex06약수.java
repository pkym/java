package for문;

public class ex06약수 {

	public static void main(String[] args) {
		// 약수
		// 2의 배수 2,4,6,8,
		// 위의 모든 2의 배수는 2가 약수이다

		// 24의 약수 구하기(나눴을 때 나머지가 0이면 약수)

		// 24%2=0
		// 24%3=0
		int num = 2000000000;

		System.out.print(num + "의 약수: ");
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(num);
		
		
		int sum = 0;
		for (int j = 1; j <= 1000; j++) {
			for (int i = 1; i < j; i++) {
				if (j % i == 0) {
					sum += i;
				}
			}
			if (sum == j) {
				System.out.print(j + " ");
			}
		}

	}

}
