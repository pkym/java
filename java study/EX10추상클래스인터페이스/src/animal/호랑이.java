package animal;

public class 호랑이 extends 포유류 implements 물, 나무 {

	// 메소드 중복정의: 오버로딩
	// 메소드 재정의: 오버라이딩
	@Override
	protected void 울다() {
		System.out.println("어흥");
	}
	@Override
	public void 헤엄치다() {
		System.out.println("멋있게");
	}
	@Override
	public void 잠수하다() {
		System.out.println("1분만");
	}
		@Override
	public void 나무타기() {
		System.out.println("나무를 타자");
	}

}
