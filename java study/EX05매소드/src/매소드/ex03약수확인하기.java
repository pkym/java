package 매소드;

public class ex03약수확인하기 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		boolean divisior = isDivisor(num1, num2);
		System.out.println("결과확인: " + divisior);

	}

	private static boolean isDivisor(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
