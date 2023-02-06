package ex02연산자;

import java.util.Scanner;

public class EX03산술연산자실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제. 초를 입력받아 시, 분, 초 형태로 출력
		// 예시) 초 입력: 3723
		// 1시 2분 3초

		// 키보드로 부터 데이터를 입력받기(Scanner)
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력:");
		int totalSecond = sc.nextInt();

		System.out.println("입력한 초:" + totalSecond);

		// 문제. 여기에서 입력받은 totalSecond를 가지고 시, 분, 초를 구해 출력하시오.

		int num1 = totalSecond / 3600;
		int num2 = totalSecond % 3600 / 60;
		int num3 = totalSecond % 3600 % 60;

		System.out.println(num1 + "시" + num2 + "분" + num3 + "초");
		
		sc.close();
		
		

	}

}
