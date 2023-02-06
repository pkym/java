package javafestival02;

import java.util.Scanner;

public class ex03단수와의곱 {

	public static void main(String[] args) {
		// 단 수와 곱해지길 원하는 수룰 입력하여 이와 같이 출력되게 하시오
		Scanner sc=new Scanner(System.in);
		System.out.println("단수입력:");
		int num1=sc.nextInt();
		System.out.println("어느수까지 출력: ");
		int num2=sc.nextInt();
		
		System.out.println("2단");
		
		for(int i=1;i<=num2;i++) {
			System.out.printf("%d*%d=%d",num1,i,num1*i);
			System.out.println();
		}
		
				
		
		
//		System.out.println("단수입력: ");
//		int num1=sc.nextInt();
//		System.out.println("어느 수까지 출력: ");
//		int num2=sc.nextInt();
//		
//		System.out.println(num1+"단");
//		for(int i=0;i<=num2;i++) {
//			System.out.printf("%d*%d=%d",num1,i,num1*i);
//			System.out.println();
//		}
		
		

	}

}
