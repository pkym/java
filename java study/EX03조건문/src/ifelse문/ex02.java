package ifelse문;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		//문제.int 타입의 변수 grade를 선언하고 키보드로 값을 입력 받으세요
		//만약 grade가 60점 이상이면 "합격입니다."
		//그렇지 않다면 "불합격입니다."를 출력하는 프로그램을 작성해보세요
		
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int grade=sc.nextInt();
		
		if(grade>=60) {
			System.out.println("합격입니다.");
			
		}else {
			System.out.println("불합격입니다.");
			
		}
		sc.close();

	}


}
