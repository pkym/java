package 상속기초;

public class Child extends Parent{
	
	// 새로운 클래스, 서브클래스, 자식클래스
	

	public void makeKal() {
		System.out.println("칼국수를 만들자 ㅎ");
	}
	
	// 메소드 오버라이딩(method overriding)
	// 부모클래스가 가지고 있던 메소드 틀(리턴타입, 메소드명, 매개변수)을
	// (void, makeKimchi,)그대로 가지고 와서
	// 안쪽에 있는 로직 ({}안) 만 재 정의 하는 것
	// 상속이 전재되어 있어야 가능하다
	
	public void makeKimchi() {
		System.out.println("맛있는 참치 김치전을 만든다");
	}
	
}
