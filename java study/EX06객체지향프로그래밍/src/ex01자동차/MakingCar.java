package ex01자동차;

public class MakingCar {

	public static void main(String[] args) {
		// 우리가 설계한 car class에서 car객체 만들기
		Car myCar = new Car();

		// 객체의 필드에 접근하기 .을 찍는다
		myCar.doorCnt = 4;
		myCar.wheelCnt = 4;
		myCar.isTrunk = true;
		myCar.handleShape = "round";
		myCar.engineType = "A";

		// 객체의 필드값 출력
		System.out.println(myCar.doorCnt);
		System.out.println(myCar.wheelCnt);
		System.out.println(myCar.isTrunk);
		System.out.println(myCar.handleShape);
		System.out.println(myCar.engineType);

		// 객체의 매소드 실행

		myCar.startUp();
		myCar.run();
		myCar.brake();
		myCar.gearChange();
		myCar.autoDrive();

	}

}
