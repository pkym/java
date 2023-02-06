package 객체배열;

public class Main {

	public static void main(String[] args) {
		// 1. 객체배열 생성
		// 자료형[] = new 자료형 [크기];
		// 포켓몬 자료형을 3개 보관 할 수 있는 bag 배열 생성

		Pokemon[] bag = new Pokemon[3];
		// 객체배열 0번 인덱스에 있는 데이터 출력
		// Pokemon형태 배열 안에는 Pokemon자료형(class)의 객체만 들어갈 수 있다.
		System.out.println(bag[0]);
		// 출력시 null 나옴

		// 객체배열 0번 인덱스에 포켓몬 넣어보자
		// 일단 객체 생성(이름:피카츄 스킬:백만볼트 hp:1000 atk:200 type: 전기)
		Pokemon pika = new Pokemon("피카츄", "전기", 1000, 200, "백만볼트");
		// 0번 인덱스에 피카츄 넣기
		bag[0] = pika;
		System.out.println(bag[0]);
		// 객체는 레퍼런스 변수 이므로 출력시 주소값 나옴
		// 한번에 집어넣기
		bag[0] = new Pokemon("피카츄", "전기", 1000, 200, "백만볼트");
		System.out.println(bag[0].getName());
		// bag[0]이 자체가 객체(pika)이기 때문에 .(접근연산자)바로 써서 이름을 부를 수 있다

		// Q. 배열안에 있는 이름, 타입, hp 전부 출력
		System.out.println("====포켓몬 정보 출력====");
		bag[1] = new Pokemon("파이리", "불", 1000, 220, "불꽃발사");

		bag[2] = new Pokemon("꼬북이", "물", 1000, 230, "물대포");

		for (int i = 0; i < bag.length; i++) {
			System.out.println(bag[i].getName() + " " + bag[i].getType() + "\t " + bag[i].getHp());
		}

		// for each문 (크기를 지정해주지 않아도 배열 크기 만큼 자동으로 반복)
		// 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용
		// 동작원리: p라는 변수에 배열을 순차적으로 담아서 코드반복
		for (Pokemon p : bag) {
			System.out.println(p.getName() + " " + p.getType() + "\t " + p.getHp());
		}

	}

}
