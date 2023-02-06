package ex02연산자;

public class EX02산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 7;
		int num2 = 3;

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		// 몫 연산자
		System.out.println(num1 % num2);
		// 나머지 연산자
		// 정수/정수 -> 정수타입

		double num3 = 3;
		System.out.println(num1 / num3);
		// 정수/실수, 실수/정수, 실수/실수 -> 더 큰 데이터 타입인 실수로 결과 나옴

		// 문자열과 숫자를 더했을 때
		String num4 = "10";
		String num5 = "7";
		System.out.println(num4 + num5);

		String num6 = 10 + 7 + "5";
		System.out.println(num6);

		String num7 = 10 + (7 + "5");
		System.out.println(num7);

	}

}
