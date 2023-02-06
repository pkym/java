package javafestival01;

import java.util.Scanner;

public class ex16N_N배열지그재그출력 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int N=sc.nextInt();
		int[][] array=new int[N][N];
		
		
		int cnt=1;		
		for(int j=0;j<array.length;j++) {
			for(int i=0;i<array[j].length;i++) {
				if(j%2==0) {
					array[j][i]=cnt;
					cnt++;
				}else {
					array[j][4-i]=cnt;
					cnt++;
				}
				
			}		
			
		}
		for(int[]array1:array) {			
			for(int num:array1) {
				System.out.print(num+"\t");
			}System.out.println();
		}
		
		
		
		
		
		
		

	}

}
