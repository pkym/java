package javapractice;

import java.util.Scanner;

public class f4 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int length = 100;
		int min = 92;
		int num1=0,num2=0; 

		for (int j = 0; j < point.length; j++) {
			for (int i = 0; i < point.length; i++) {
				if(point[j]>point[i]) {					
					length = point[j] - point[i];
					if(length<min) {
						min=length;
						num1=j; num2=i;
					}	
				}
			}

		}
		System.out.printf("result = [%d, %d]",num1,num2);
	}

}
