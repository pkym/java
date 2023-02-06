package 매소드;

public class ex09메소드오버로딩 {

	public static void main(String[] args) {

		System.out.println(add(3, 4));
		System.out.println(add(3.5, 7.5));

	}

	private static int add(int num1, int num2) {
		return num1 + num2;
	}

	private static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	//메소드 오버로딩(중복정의)
	//매개변수의 개수를 다르게 하고, 메소드 이름은 똑같이 부여
	//조건
	//1. 이름이 같아야 한다.
	//2. 매게 변수의 개수 혹은 자료형이 달라야 한다.
	//3. 매개변수와 메소드 이름이 동일하고 리턴타입만 다른 경우는 실행되지 않는다.

}
