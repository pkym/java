package javafestival02;

import java.util.Scanner;

public class ex02별입력 {

	public static void main(String[] args) {
		// 사용자에게 입력받아 배열의 인덱스 수 만큼 별을 출력해보세요

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print(i + "번째 별의 수: ");
			array[i] = sc.nextInt();

		}

		for (int j = 0; j < 5; j++) {
			System.out.print(array[j] + ":");
			for (int i = 0; i < array[j]; i++) {
				System.out.print("*");
			}System.out.println();

		}
		
		
		
		
		
		
		
		
		
		
		
		

//		int[] array = new int[10];
//
//		for (int i = 0; i < 5; i++) {
//			System.out.print(i + "번째 별의 수 : ");
//			int num = sc.nextInt();
//			array[i] = num;
//
//		}
//		for (int i = 0; i < 5; i++) {
//			System.out.print(array[i] + ":");
//			for (int j = 0; j < array[i]; j++) {
//				System.out.print("* ");
//
//			}System.out.println();
//
//		}

	}

}
