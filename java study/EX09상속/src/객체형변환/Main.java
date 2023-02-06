package 객체형변환;

public class Main {

	public static void main(String[] args) {
		// 객체 만들기
		// 1. Phone의 객체 p1
		// 2. SmartPhone의 객체 iPhone

		Phone p1 = new Phone();

		SmartPhone iP1 = new SmartPhone();

		// Casting 형변환
		// 레퍼런스 타입의 형변환은 어떻게 일어날까~?
		// 상속이 전제되어 있어야 하며
		// 객체 내 필드, 메소드의 접근 권한에 따라 형 변환이 달라진다
		// 강제형변환인지 자동현변환인지 결정된다

		// 1) Upcasting
		// : 자식클래스(서브클래스)가 부모클래스(슈퍼클래스)로
		// ex) 아이폰은 핸드폰이다(자동으로 변환)

		// 폰을 스마트폰 클래스로 만드는 것
		// 그러나 폰의 형태이기 때문에 폰에 없는 메소드(wifi)는 사용x

		Phone p = new SmartPhone();
		p.call();
		// 객체(하위클래스) 내에 모든 필드에 접근할 수 있는게 아니라
		// 상위클래스에 있는 필드와 메소드에만 가능하다

		p.message();
		// 단 오버라이딩 된 메소드에 한해서는 하위클래스가 갖고 있는
		// 메소드를 사용한다.

		// 2) Downcasting
		// : 부모클래스가 자식클래스로 강제형변환
		// 이미 업케스팅 된 것을 되돌릴 때만 가능하다
		// 폰이라는 설계도만으로는 스마트폰을 만들수 없다
//		SmartPhone ip = (SmartPhone) new Phone();
		// 문법적 오류는 안나지만 컴파일 오류난다(불가능)

		SmartPhone ip = (SmartPhone) p;

		ip.call();
		ip.message();
		ip.wifi();

	}

}
