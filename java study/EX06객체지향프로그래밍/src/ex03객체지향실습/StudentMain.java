package ex03객체지향실습;

public class StudentMain {

	public static void main(String[] args) {

		// stu1객체 생성
		Student stu1 = new Student();
		// Student(); 생성자(constructor) 메소드
		// 기본생성자: 매개변수가 없는 상태 메소드(비어있는 logic)-생략이 가능함
		// but 생성자메소드 새로 만들어 주면 기본생성자는 사라짐(덮어 씌워져버림)
		// --->기본생성자를 살리고 싶다면? 메소드 오버로딩
		// 생성자를 중복정의 하면된다.

		// private 클래서를 만들었더니 메소드가 됨
		stu1.setName("채수민");
		stu1.setNumber("20220878");
		stu1.setAge(20);
		stu1.setScoreJava(50);
		stu1.setScoreWeb(99);
		stu1.setScoreAndroid(77);
		// stu1의 이름과 자바점수를 출력해주세요
		System.out.println(stu1.getName());
		System.out.println(stu1.getScoreJava());

		// 객체를 만들 때부터 데이터를 생성하기 위해선
		Student stu2 = new Student("채수민", "20220878", 20, 50, 99, 77);
		// stu2의 이름과 안드로이드 점수 출력
		System.out.println(stu2.getName());
		System.out.println(stu2.getScoreAndroid());

	}

}
