package 단순if문;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int타입 변수num을 선언해 키보드를 값을 입력받으세요
		// 만약 num이 3의 배수이면서 5의 배수라면
		// "3과 5의 배수입니다"라고 출력하는 프로그램을 만드세요

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();

		if (num % 5 == 0 && num % 3 == 0) {
			System.out.println("3과 5의 배수입니다");
		}

		System.out.println("끝");
		sc.close();
		
		

	}

}
