package 일차원배열;

import java.util.Scanner;

public class ex08수박게임 {

	public static void main(String[] args) {
		// 수박게임
		// 숫자를 입력받아 숫자 만큼 수박이 나오는 게임
		
		//힌트. 이 게임은 홀짝 판별과 관련이 있다

		System.out.println("====수박 게임 Start!====");
		Scanner sc = new Scanner(System.in);
		char[] text = { '수', '박' };

		System.out.print("숫자를 입력해주세요>> ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			System.out.print(text[i % 2]);

		}
//		또는
//		int[] array= new int[num];
//    	for(int i=0; i<num; i++){
//    		array[i]=i+1;
//    		if(array[i]%2==0) {
//    			System.out.print(text[1]);
//    			
//    		}else {
//    			System.out.print(text[0]);
//    		}
//    	}
		
		
		
//	i=1
//		System.out.println(text[0]);
//	i=2
//		System.out.println(text[0]);
//		System.out.println(text[1]);
//	i=3
//		System.out.println(text[0]);
//		System.out.println(text[1]);     
//		System.out.println(text[0]);
//		
//
		

	}

}
