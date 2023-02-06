package javafestival02;

import java.util.Random;

public class ex01로또프로그램 {

	public static void main(String[] args) {
//		// 중복없이 숫자를 뽑는 로또 프로그램을 만드시요

	Random r = new Random();
	int[] array = new int[6];
	
	for(int j=0;j<6;j++) {
		array[j]=r.nextInt(45)+1;		
		for(int i=0;i<j;i++) {
			if(array[j]==array[i]) {
				j--;				
			}
		}		
	}
	for(int i=0;i<6;i++) {
		System.out.println("행운의숫자: "+array[i]);
	}
		
	
	}


	
	
	
	//
//		Random r = new Random();
//
//		int[] array = new int[6];
//
//		for (int i = 0; i < 6; i++) {
//			array[i] = r.nextInt(44) + 1;
//			for (int j = 0; j < i; j++) {
//				if (array[i] == array[j]) {
//					
//					i--;
//				}
//			}
//		}
//		for (int i = 0; i < 6; i++) {
//			System.out.print("행운의 숫자 : " + array[i]);
//			System.out.println();
//		}
//	}

}
