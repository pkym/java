package while문;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		//Q. while문을 사용해 입력받은 수를 누적하는 프로그램을 작성하세요
		//-1을 입력한 경우 프로그램을 종료
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		while(true) {
			System.out.print("정수 입력: ");
			int num=sc.nextInt();
			sum+=num;
			System.out.println("누적 결과:" +sum);
			
		
		if(num==-1) {
			System.out.println("종료되었습니다.");
		break;
		}
			
		}

	}

}
