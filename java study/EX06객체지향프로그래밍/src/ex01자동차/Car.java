package ex01자동차;

public class Car {
	// 필드-데이터를 저장한느 공간(변수)
	int doorCnt; // 문의 개수, 차 마다 다르므로 값을 넣지 않는다
	int wheelCnt; // 바퀴의 개수
	boolean isTrunk; // 트렁크의 유무, 논리형 변수 앖에 is 붙임
	String handleShape; // 핸들 모양
	String engineType; // 앤진 종류

	// 메소드-객체가 할 행위
	// 시동걸기
	public void startUp() {
		System.out.println("부와아아아부르릉");
	}
	// 가속하다
	public void run() {
		System.out.println("우우웅우우웅우");
	}
	// 정지하다
	public void brake() {
		System.out.println("끼이이이이익");
	}
	// 기어변환
	public void gearChange() {
		System.out.println("기어를 변환합니다");
	}
	// 자율주행하다
	public void autoDrive() {
		System.out.println("자율지행을 시작합니다");
	}

}
