package 매소드;

public class ex06돌아온완전수 {

	public static void main(String[] args) {
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int startValue, int endValue) {
		System.out.print("2~1000까지의 완전수: ");

		for (int j = startValue; j <= endValue; j++) {
			int sum = 0;  //자기자신을 제외한 약수의 총합을 저 장할 변수
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
