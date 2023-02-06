package ex02연산자;

import java.util.Scanner;

public class Ex03산술연산자숙제 {

	public static void main(String[] args) {
		// Java, web, android 점수를 키보드로 부터 입력 받아 합계와 평균을 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.print("Java 점수 입력:");
		int javaScore = sc.nextInt();
		System.out.print("web 점수 입력:");
		int webScore = sc.nextInt();
		System.out.print("Android 점수 입력:");
		int androidScore = sc.nextInt();

		int num = javaScore + webScore + androidScore;

		System.out.println("합계:" + num);
		System.out.println("평균:" + num / 3);

		sc.close();

	}

}
