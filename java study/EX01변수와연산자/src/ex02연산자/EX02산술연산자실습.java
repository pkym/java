package ex02연산자;

public class EX02산술연산자실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제. 백의 자리 이하 숫자를 모두 버리세요
		// 결과 확인: 400
		// 단, 1.num=400; 직접 넣기 불가
		// 2. 출력문에 400을 쓰는 경우도 안됨
		int num = 456;
		/////////////////////////////////
		int num1 = 100;
		int num2 = num;
		num = num2 - (num2 % num1);

		/////////////////
		// 1. 현재 변수에서 십의자리만 가져와서 본 숫자에서 제거
		// num=num-num%100;
		// 2. 100으로 나눈 몫*100
		// num=num/100*100;
		// 3. 출력문에 100으로 나눈 몫+"00"

		System.out.println("결과확인:" + num);

	}

}
