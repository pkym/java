package animal;

public interface 물 {

	// abstract 보통 생략 됨-모든 메소드 추상화됨
	// 구현화 시켜야 함(implement)
	// package와 관계없이 다 쓰기 위해 public
	public abstract void 헤엄치다();
	public abstract void 잠수하다();
	
	// 무조건 적으로 바디가 없기 때문에
	// 다중 인터페이스가 가능하다

}
