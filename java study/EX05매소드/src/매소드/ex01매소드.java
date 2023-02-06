package 매소드;

public class ex01매소드 {

	public static void main(String[] args) {
		// 메소드란..?
		// 객체의 행위를 표현하기 위한 것
		// java에서 특정코드를 기능으로 묶고 호출해서 사용하는 기법
		// 실습- 두 개의 숫자를 입력받아서 두 수의 차를 알려주는 메소드 만들기
		// 주의: 메소드는 메소드안에서 만들 수 없다
		int result1=difinNum(10,1);
		System.out.println(result1);
		

	}

	// 두 개의 숫자를 입력받아 두수의 차를 알려주는 메소드
	public static int difinNum(int num1, int num2) {

		int result = num1 > num2 ? num1 - num2 : num2 - num1;
		return result;

	}

}
