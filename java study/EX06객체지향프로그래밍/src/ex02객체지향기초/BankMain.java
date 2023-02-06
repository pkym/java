package ex02객체지향기초;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Bankbook bank = new Bankbook();

		Scanner sc = new Scanner(System.in);
		bank.money = 0;
			
		System.out.print("입금할 금액 입력>> ");	
		int money = sc.nextInt();
		bank.deposit(money);
		bank.showmoney();
		
		
		System.out.print("출금할 금액 입력>> ");		
		bank.withdraw(sc.nextInt());
		bank.showmoney();

	}

}
