package javafestival02;

import java.util.Scanner;

public class ex11세자리수계산 {

	public static void main(String[] args) {
		// 세자리수를 입력받아
		// 세자리수 * 세자리수를 계산하시오

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();

		int temp1 = num1 * (num2 % 10);
		System.out.println(temp1);
		int temp2 = num1 * (num2 % 100/10) ;
		System.out.println(temp2);
		int temp3 = num1 * (num2 /100) ;
		System.out.println(temp3);
		
		int sum=temp1+temp2*10+temp3*100;
		
		System.out.println(sum);

	}

}
