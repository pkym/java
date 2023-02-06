package switch문;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		//Q. 월을 입력받아 봄,여름,가을,겨울 중 맞는 계절을 알려주는 프로그램.
				
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int month=sc.nextInt();
		String season="";
									
			switch(month) {
			case 12, 1, 2:	
				season="겨울";
				break;
			case 3, 4, 5:
				season="봄";
				break;
			case 6, 7, 8:
				season="여름";
				break;
			case 9, 10, 11:	
				season="가을";
				break;
			default: 
				season="아무것도 아";
												
			}
			
			System.out.println(month+"월은 "+season+"입니다.");
		

	}

}
