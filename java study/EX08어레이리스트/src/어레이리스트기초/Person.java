package 어레이리스트기초;

public class Person {
	// 설계도

	// 1. Field(속성, 데이터)
	private String name;
	private int age;

	// 2. Method(기능, 로직)

	// 생성자 메소드-모든 필드 초기값을 채우는

	// 모든 필드에 getter만

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
