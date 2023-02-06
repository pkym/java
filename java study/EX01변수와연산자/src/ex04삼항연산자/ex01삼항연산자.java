package ex04삼항연산자;

public class ex01삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//||둘 중 하나 만 참이여도 참
		//&&둘 중 하나만 거짓이어도 거짓
		int a = 3;
		int b = 4;
		boolean what = a<b||a==b;
		System.out.println(what);
		System.out.println(a<b&&a==b);
		
		
		// 삼항연산자 구조
		// 조건식(boolean 타입)?(실행문1):(실행문2);
		// 1. 정수형 num숫자 2데이터 넣기
		int num = 2;
		// 2. num 숫자가 짝수인지 홀수 인지 판별
		String result = num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		System.out.println(result);

		int c = 1;
		int d = 2;
		boolean answer = c > d ? true : false;
		System.out.println(answer);

		int e = 3;
		int f = 4;
		int results = e > f ? 0 : 1;
		System.out.println(results);
		
	
	}

}
