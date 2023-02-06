package ex04삼항연산자;

import java.util.Scanner;

public class ew02삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q1.두 개의 정수를 입력받아 큰수에서 작은수를 뺀 결과값을 출력하는 프로그램을 만들어보자

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력:");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력:");
		int num2 = sc.nextInt();

		System.out.println(num1 > num2 ? num1 - num2 : num2 - num1);
		sc.close();

	}

}
