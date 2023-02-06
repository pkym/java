package 단순if문;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;

		if (num1 > num2) {
			// 조건이 참일 때만 실행되는 문장
			System.out.println("num1이 num2보다 크다");
		}

		System.out.println("끝");

		// Q. int 타입의 변수 age를 선언하고 키보드로 값을 입력받으세요.
		// 만약 age가 20보다 크거다 같다면 성인입니다.
		
		//나이 입력받기
		//1.스캐너를 sc의 이름으로 데려오기
		Scanner sc = new Scanner(System.in);
		//2.출력문
		System.out.print("나이를 입력하세요:");
		//3.숫자를 입력받아서 변수에 담기
		int age = sc.nextInt();
		
		sc.close();
		
		//성인인지 아닌지 구분하기
		if (age >= 20) {
			System.out.println("성인입니다");
		}
	}

}
