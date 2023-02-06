package 다중if문;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		//Q.정수를 입력받아 0인지, 홀수인지, 짝수인지 판별하는 프로그램
		
		//정수 입력받기
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		//조건판단
		if(num==0) {System.out.println("0입니다.");
		} else if(num%2==0) {System.out.println("짝수입니다.");
		} else {System.out.println("홀수입니다.");
		
		}
		sc.close();

	}

}
