package javapractice;

import java.util.Scanner;

public class f3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array=new int[10];
		for(int i =0; i<10;i++) {
			System.out.print(i+1+"번째 정수입력>> ");
			array[i]=sc.nextInt();
		}
		System.out.print("3의 배수: ");
		for(int i=0;i<10;i++) {
			if(array[i]%3==0) {
				System.out.print(array[i]+" ");
			}
		}

	

	}

}
