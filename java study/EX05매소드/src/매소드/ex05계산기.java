package 매소드;

public class ex05계산기 {

	public static void main(String[] args) {
		//
		int num1 = 50, num2 = 15;
		char op = '-';

		System.out.println(cal(num1, num2, op));
		System.out.println(cal(34,45,'*'));

	}

	public static int cal(int num1, int num2, char op) {
		int result = 0;
		if (op == '-') {
			result = num1 - num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		} else if (op == '+') {
			result = num1 + num2;
		} else {
			result =-1;
		}

		return result;

	}

}
