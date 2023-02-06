package ex02객체지향기초;

public class Member {
	// 설계도
	// 화원정보를 담자

	// 1. 필드(date, 속성)
	// 이름
	String name;
	// 연락처
	String phone;
	// 생년월일
	int birth;
	// 성별
	char gender;
	// 나이
	int age;

	// 2. 메소드(logic, 기능)--접근제한자로 시작한다
	// 회원가입한다
	public void join(String inputName, int inputAge) {
		name = inputName;
		age = inputAge;
		System.out.println("회원가입완료");
	}
	// 로그인한다
	public void login() {
		System.out.println(name + "님이 로그인 했습니다");
	}
	//

	//

	//

}
