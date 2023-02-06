package ex03객체지향실습;

public class Student {

	// 학생의 정보를 담을 수 있는 필드 작성
	// >>private 을 자료형 앞에 붙여 보안 강화
	// 이름
	private String name;
	// 학번
	private String number;
	// 나이
	private int age;
	// 자바점수
	private int scoreJava;
	// 웹점수
	private int scoreWeb;
	// 안드로이드점수
	private int scoreAndroid;

	public Student(String name, String number, int age, int scorejava, int scoreweb, int scoreandroid) {
		// 생성자메소드: 객체생성 안된상태이므로 값 넣어줘야함
		// 특징: 1. 리턴타입이 없다(void도 쓰지 않는다)
		// 2. 클래스 이름이 메소드 이름과 같아야 한다(대소문자 구별)
		// 3. new 키워드를 사용 시 호출되는 메소드(객체 생성시)
		// 4. 기본생성자는 생략 가능
		// 5. 개방자가 새로운 생성자 만들어 내면 기본생성자는 사라진다(메소드 오버로딩 통해 극복)
		// 6. 생성자는 하나 이상 선언되어야 한다.
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreAndroid = scoreandroid;
		this.scoreJava = scorejava;
		this.scoreWeb = scoreweb;

	}

	public Student() {
		// 기본생성자-메소드 오버로딩 된 상태 
	}

	// >>메소드 2개가 생성됨(getter와setter로만 private에 접근가능)
	// 1.getter 메소드-name이라는 것을 가져와서 쓸 수 있게 하겠다
	// private으로 숨겨져 있는 필드의 데이터에 접근(메인에서 사용)
	// 다른 클래스에서 데이터를 가져갈 수 있게끔 만들어주는 메소드
	// 필드값을 리턴해야지 다른 클래스에서 쓸 수 있음
	public String getName() {
		return name;
	}
	// 2.setter 메소드
	// private으로 숨겨져 있는 필드의 값을 수정하고 싶을 떄 사용
	// 수정만 할 때는 따로 리턴할 필요X
	// 수정할 값을 main의 매개변수에 넣어준다
	
	// 필드에 있는 name에 수정할 값(매개변수도 받아온)을 대입해준다
	// 필드에 영향을 끼치는 매개변수 받아올 때는 동알한 이름으로 지어준다.
	// this. 가 없다면 필드에 값이 들어가지 않음, 구별해주기위해서
	// : 현재 우리가 코드를 작성하는 class 그 자체를 의미

	public void setName(String name) {
		this.name = name;
	}

	// 한번에 게터세터 만들기
	// 단축기 alt+shift+S -> generator
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

}
