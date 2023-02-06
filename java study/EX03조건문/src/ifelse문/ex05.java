package ifelse문;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int month=sc.nextInt();   
		String season="";  
		
		if(month==12||month<3) {
			season="겨울";
		}else if(month<6) {
			season="봄";
		}else if(month<9) {
			season="여름";
		}else if(month<12) {
			season="가을";
		}else {
			System.out.println("아무계절도 아닙니다.");
		}
		
		if(month>=1&&month<=12) {
		System.out.println(month+"월은 "+season+"입니다.");}

	}

}
