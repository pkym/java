package javafestival01;

import java.util.Scanner;

public class ex18입력받아정수합구하기 {

	public static void main(String[] args) {
		// 8자리 정수를 입력받아 반복문을 활용하여
		// 입력받은 정수의 합을 구하여 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			sum+=num%10;
			num=num/10;	
		}									

//		for (int i = 8; i >= 0; i--) {
//			int a = (int) Math.pow(10, i);
//			int result = num / a;
//			num -= result * a;
//			plus += result;//
//		}		
	
		System.out.printf("합은 %d입니다", sum);
		sc.close();

	}

}
