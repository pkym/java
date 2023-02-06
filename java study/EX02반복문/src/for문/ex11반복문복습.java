package for문;

public class ex11반복문복습 {

	public static void main(String[] args) {
		// 1부터 10까지출력하시
		// for(초기화구문;조건식;반복후작업){
		// 조건식이 true일 때 실행하는 문장}
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 1부터 10까지 홀수만
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// 10의 약수만 출력
		for (int i = 1; i <= 10; i++) {
			if (10 % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// 1000까지 완전수 부터 자기자신을 제외한 약수의 총합이 자기와 똑같은 수
		for (int j = 1; j <= 1000; j++) {
			int sum = 0;
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
