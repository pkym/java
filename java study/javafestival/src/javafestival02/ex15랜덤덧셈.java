package javafestival02;

import java.util.Random;
import java.util.Scanner;

public class ex15랜덤덧셈 {

	public static void main(String[] args) {
		Random r=new Random();
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			
			int num1=r.nextInt(9);
			int num2=r.nextInt(9);
			System.out.printf("%d+%d= ",num1,num2);
			int num=sc.nextInt();
			
			if(num1+num2==num) {
				System.out.println("SUCCESS!");
			}else {
				System.out.println("Fail...");
			}
						
		}
		System.out.println("GAME OVER!");
		sc.close();

	}

}
