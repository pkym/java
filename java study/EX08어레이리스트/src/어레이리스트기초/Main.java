package 어레이리스트기초;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	// ArrayList
	// : 크기가 가변적인 배열과 같은 형태를 가진 !!클래스!!
		
	// collection
	// : 특정 자료구조를 클래스화 시킨 것
		
	// 1. ArrayList 생성
	// 레퍼런스 타입의 데이터만 저장할 수 있다.
	// 레퍼런스 타입: String, 내가 만든 클래스들(Pokemon, Student, Member) 
	// 레퍼런스 변수: 객체
		
	ArrayList<String> list = new ArrayList<String>();
	// 기본생성자 사용중~
	// <>: 제네릭 기법 - 객체를 생성하는 순간에 자료형이 결정되는 기법
	// 사용자가 만든 어떤 것이든 동작할 수 있게 도와주는 기법
	
	// 2. 데이터 추가하기
	list.add("닭도리탕");
	list.add("허니콤보");
	list.add("떡볶이");	
	// 배열처럼 크기와 인덱스도 갖고 있음 
	
	// 3. 데이터 특정 위치에 추가하기
	list.add(0, "소곱창");
	//소곱창이 가장 앞으로 오고 닭도리탕1 허니콤보2 떡볶이3으로 밀려남
	//1번에 넣으면 닭도리탕과 허니콤보 사이에 들어감
	
	// 4. 데이터 가져오기-닭도리탕 출력
	System.out.println(list.get(1));
	
	// 5. 데이터 삭제-허니콤보 출력
	list.remove(1);
	System.out.println(list.get(1));
	
	// 6. 데이터 크기 알아보기-3출력
	System.out.println(list.size());  
	//메소드 값/ cf) array.length 필드 값
	
	// 6. 데이터 전체 삭제
	list.clear(); //리턴 타입 없어서 뭐 안나옴
	System.out.println(list.size()); //사이즈는 리턴 타입 있어서 0 나옴
	
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}


