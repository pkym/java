package javafestival01;

import java.util.Scanner;

public class ex13N_N배열 {

	public static void main(String[] args) {
		// 정수N을 입력받아 N*N 배열에 다음과 같이 숫자를 저장하고 출력하시오
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int N=sc.nextInt();
		int[][] array = new int[N][N];
		
		int cnt=1;
				
		for(int j=0;j<array.length;j++) {
			for(int i=0;i<array[j].length;i++) {
				array[i][j]=cnt;
				cnt++;				
			}			
		}
		for(int[]array1:array) {
			for(int num:array1) {
				System.out.print(num+"\t");
			}System.out.println();
		}		
		
		
		

	}

}
