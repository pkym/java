package javafestival01;

import java.util.Scanner;

public class ex17입력받아수열출력 {

	public static void main(String[] args) {
		// 정수 n을 입력받아 1,2,4,6,11과 같은 수열의 n번쨰 항까지 출력하시오.
		
		Scanner sc=new Scanner(System.in);
		System.out.print("n 입력: ");
		int num=sc.nextInt();
		
		int cnt=1;
		
		for(int i=1;i<num+1;i++) {
			System.out.print(cnt+" ");
			cnt+=i;
		}

	}

}
