package ex02객체지향기초;

import java.util.Scanner;

public class Bankbook {

	// 1.필드(데이터)-잔액
	int money;
	

	// 2.메소드(기능)-입금하다,출급하다,잔액보기

	public void deposit(int inputMoney) {		

		money += inputMoney;

	}

	public void withdraw(int outputMoney) {
		
		money -= outputMoney;

	}

	public void showmoney() {
		System.out.println("잔액은 " + money + "원 입니다");

	}

}
