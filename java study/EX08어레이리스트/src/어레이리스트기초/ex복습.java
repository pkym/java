package 어레이리스트기초;

import java.util.ArrayList;

public class ex복습 {

	public static void main(String[] args) {

		// 자바 메모리 구조 (stack/hemp-임시 메모리 공감)
		// 자료구조(Data Structure)
		// 배열: 인덱스를 사용한다, 첨자를 사용한다

		// Java에서의 배열
		// 인덱스를 통해 접근
		// 크기가 정해진다(생성)
		// 장점: 크기연산x, 계산이 빨라짐(효율)
		int[] array;
		array = new int[5];

		// List 인터페이스를 구현 받아서 만든다
		// ArrayList라는 클래스 사용 (자바 유틸 내에 있는 Scanner Random 등 개발자를 위한 클래스)
		// <E> 제네릭 타입 : 강한 타입 체크 ex) 너가 만드는 어레이는 반드시 스트링이어야 한다
		// get은 보통 object타입으로 리턴함
		// java 1.8 이상부터 생성시 타입체크 생략 가능 ArrayList<>
		// 컴파일시 자동으로 추가 ex)int[] array={1,2,3}; -> new int[]가 생략 된 것
		// ex)String name="기영민";도 new String("기영민"); 생략 된 것임
		// ex)기본생성자 생략 된 것

		ArrayList<String> musicList = new ArrayList<>();
		// add(index, element);
		musicList.add("Hype boy");
		musicList.add("Antiprezle");
		musicList.add("Love dive");
		musicList.add("Tomboy");
		musicList.add("When I move");

		// remove
//		musicList.remove(2);
		// clear
//		musicList.clear();

		// hypeboy 안에 그 요소가 포함되어있는지
		System.out.println(musicList.get(0).contains("boy"));

		// get(index)
		for (int i = 0; i < musicList.size(); i++) {
			
			System.out.println(musicList.get(i));
		}

	}

}
