package ex04포켓몬게임;

import java.util.Scanner;

public class PokemonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 포켓몬 두마리 생성
		// 이상해씨/풀/1000/150/"덩굴채찍"
		// 피카츄/전기/1000/200/"백만볼트"
		Pokemon strange = new Pokemon("이상해씨", "풀", 1000, 150, "덩굴채찍");
		Pokemon pika = new Pokemon("피카츄", "전기", 1000, 200, "백만볼트");

		// 2. 사용자로부터 포켓몬을 선택하게 한다.
		while (true) {
			System.out.println("====포켓몬을 선택하기====");
			System.out.print("[1]이상해씨 [2]피카츄 >> ");
			int num1 = sc.nextInt();

			// 3. 사용자가 입력한 값 구분하기
			if (num1 == 1) {
				// 이상해씨 선택
				System.out.println("====공격패턴 선택====");
				System.out.print("[1]일반공격 [2]스킬공격 >>");
				int num2 = sc.nextInt();
				if (num2 == 1) {
					// 이상해풀이 피카츄를 일반공격
					// 피카츄의 hp가 이상해씨의 atk만큼 달아진다
					pika.setHp(pika.getHp() - strange.getAtk());
					System.out.println("이상해씨 공격!!");

				} else {
					// 이상해 풀이 피카츄를 스킬 공격
					// 피카츄의 hp가 이상해씨의 atk*1.5만큼 달아진다.
					pika.setHp((int) (pika.getHp() - strange.getAtk() * 1.5));
					System.out.print("이상해씨 스킬공격!!! ");
					System.out.println(strange.getSkill());
				}

			} else if (num1 == 2) {
				// 피카츄 선택
				System.out.println("====공격패턴 선택====");
				System.out.print("[1]일반공격 [2]스킬공격 >>");
				int num2 = sc.nextInt();
				if (num2 == 1) {
					// 피카츄가 이상해씨를 일반공격
					strange.setHp(strange.getHp() - pika.getAtk());
					System.out.println("피카츄 공격!!");
				} else {
					// 피카츄가 이상해씨를 스킬 공격
					strange.setHp((int) (strange.getHp() - pika.getAtk() * 1.5));
					System.out.print("피카츄 스킬공격!!! ");
					System.out.println(pika.getSkill());
				}

			} else {
				System.out.println("포켓몬을 다시 선택하세요");
			}
			
			System.out.println("이상해씨 체력"+strange.getHp());
			System.out.println("피카츄 체력"+pika.getHp());
			System.out.println();
			 
			//두 마리 중 한마리라도 체력이 0보다 작거나 같은 경우 프로그램 종료					
			
			if (strange.getHp() <= 0) {
				System.out.println("피카츄 승");
				break;
			} else if (pika.getHp() <= 0) {
				System.out.println("이상해씨 승");
				break;
			}

		}

	}

}
