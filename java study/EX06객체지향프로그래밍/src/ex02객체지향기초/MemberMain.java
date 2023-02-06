package ex02객체지향기초;

public class MemberMain {

	public static void main(String[] args) {
		// 실행하는 공간, 객체를 생성할 수 있는 공간

		// 1. 클래스기반 객체생성(메모리 생성)--클래스의 실체화
		// 1)자료형(클래스)부터 불러온다
		// 2)객체는 레퍼런스 변수이므로 new 필요
		// 자료형 변수명 = new 자료형();

		Member m1 = new Member();
		System.out.println(m1);
		// 그냥 이대로 출력시 주소값 나옴
		// why?(레퍼런스 변수는 주소를 갖고 있음-주소타고 들어가면 실제값있음)
		// 실제 데이터 보려면 .(접근연산자)을 찍어줘야 함
		System.out.println(m1.name);
		System.out.println(m1.age);
		// 출력시 null값/0 나옴 >> String의 기본형 null/int의 기본형은 0
		m1.join("산타", 24);
		System.out.println(m1.name);
		System.out.println(m1.age);
		// 출력시 이름, 나이 잘 나옴

		m1.phone = "010-1234-5678";
		m1.birth = 20001225;
		m1.gender = 'F';
		
		System.out.println(m1.phone);
		System.out.println(m1.birth);
		System.out.println(m1.gender);
		
		// 2.또 다른 객체 만들기
		
		m1.join("연", 20);
		m1.phone = "010-9876-5432";
		m1.birth = 20040602;
		m1.gender='F';
		
		System.out.println(m1.name);
		System.out.println(m1.age);
		System.out.println(m1.phone);
		System.out.println(m1.birth);
		System.out.println(m1.gender);
		
		
		
		

	}

}
