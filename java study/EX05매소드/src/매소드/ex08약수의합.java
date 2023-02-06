package 매소드;

public class ex08약수의합 {

	public static void main(String[] args) {
		// 약수의 합을 구하여 반환하는 메소드를 구현하세요

		final int num = 10;
		int result = getSumofDivisiors(num);
		System.out.println(num + "의 약수의 합: " + result);
		getDivisior(num);

		int a=900;
		byte b=(byte)a;
		System.out.println(b);
		
	}

	public static int getSumofDivisiors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void getDivisior(int num) {
		System.out.print("10의 약수: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	
	
}
