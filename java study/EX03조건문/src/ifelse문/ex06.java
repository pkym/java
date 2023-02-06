package ifelse문;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1.출력
		System.out.print("금액을 입력하세요: ");
		//2.금액을 입력하기
		int money=sc.nextInt();
		//3.메뉴 출력하기
		System.out.println("메뉴를 고르세요. ");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		int choice=sc.nextInt();
		int change=0;
		
		//4. 사용자가 어떤 메뉴를 선택했는지 판단
		
		if(choice==1) {			
			change=money-700;	
			
		}else if(choice==2) {
			change=money-1000; 
		    		
		}else if(choice==3) {
			change=money-500; 
							   
		}else {System.out.println("올바른 메뉴가 아닙니다.");
		}
		//5.잔돈출력하기
		if(change>=0) {
			
			System.out.println("잔돈: "+change+"원");
					
		} else	{
			System.out.println("돈이 "+-change+"원 부족합니다.");
			System.out.println("잔돈: "+money+"원");
		}


	}

}
