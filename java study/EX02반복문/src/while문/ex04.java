package while문;

import java.util.Scanner;


public class ex04 {

	public static void main(String[] args) {
		// Q. 숫자를 입력받아 홀수와 짝수가 각각 몇개 입력되었는지 출력하는 프로그램
		//-을 입력한 경우 프로그램 종료
		Scanner sc=new Scanner(System.in);
		int num=0;
		int even=0;
		int odd=0;
		
		while(true) {
			System.out.print("숫자 입력: ");
			num=sc.nextInt();
			if(num%2==0) {
				even++;
				System.out.println("짝수개수: "+even);
				System.out.println("홀수개수: ");
			}else if(num%2==1){
				odd++;
				System.out.println("짝수개수: ");
				System.out.println("홀수개수: "+odd);
			}else if(num==-1) {
				System.out.println("종료되었습니다.");
				break;
			}
		
			
		}
///	while(num!=-1) {
//			System.out.print("숫자 입력: ");
//			num=sc.nextInt();
//			if(num%2==0) {					
//			even++;
//			System.out.println("짝수개수: " +even );
//			System.out.println("홀수개수: ");	
//		
//		}else if(num%2==1) {		
//			odd++;
//			System.out.println("짝수개수: " );
//			System.out.println("홀수개수: "+odd);	
//		}else {
//			System.out.println("종료되었습니다");
//		}
//	
		 
		
		
		
		
		
		
		

	}

}
