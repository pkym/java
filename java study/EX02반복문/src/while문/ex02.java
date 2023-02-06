package while문;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// Q. while 문을 사용하여 키보드로 입력받은수가 10보다 작을 때만 계속 정수를 입력 받으세요.
		// 10보다 큰 수를 입력하면 종료되었습니다를 출력

		// 1.입력도구 가져오기
		Scanner sc = new Scanner(System.in);
		// 2.반복시킬 코드 찾기
		//int num=0;
		//while(num<10){System.out.print("정수 입력: ");
		//num = sc.nextInt();}
		//System.out.println("종료되었습니다.");
		while (true) {
			System.out.print("정수 입력: ");
			int num = sc.nextInt();
			// 3.break 걸어주기
		if (num >= 10) {
			System.out.println("종료되었습니다.");
			break;
			}
		}

	}

}
