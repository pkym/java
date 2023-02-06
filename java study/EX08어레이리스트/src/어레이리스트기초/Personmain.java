package 어레이리스트기초;

import java.util.ArrayList;

public class Personmain {

	public static void main(String[] args) {
		// 1. person 자료형을 가진 plist라는 이름을 가진
		// Arraylist 생성하기-person 자료형만 보관 가능
		ArrayList<Person> pList = new ArrayList<Person>();

		// 2. 팀원 데이터 추가하기
		// person 자료형을 넣어줘야 함
		// 먼저 Person을 만들 고 넣기
		// Person p1=new Person("이름",나이);

		pList.add(new Person("영민", 1));
		pList.add(new Person("미연", 2));
		pList.add(new Person("근호", 3));
		pList.add(new Person("성규", 4));

		// 3. 팀원 이름출력
		// 객체는 레퍼런스 변수-> 주소값 갖고 있다
		// 따라서 pList.get(0) 만하면 주소값이 나옴 .을 통해서 가져올 수 있음
		System.out.println(pList.get(0).getName());

		// 4. 팀원 이름, 나이 전부 출력
		for (Person p : pList) {

			System.out.print(p.getName() + " ");
			System.out.print(p.getAge());
			System.out.println();

		}

	}

}
