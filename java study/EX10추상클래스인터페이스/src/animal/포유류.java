package animal;

//내가 가진 메소드 중 하나라도 추상메소드를 갖고 있다면
//클래서 역시 추상 클래스 여야 한다
public abstract class 포유류 implements 물 {

	protected void 먹다() {
		System.out.println("먹다");

	}

	// 추상화된 메소드는 바디가 없다
	protected abstract void 울다();

	protected void 자다() {
		System.out.println("자다");
	}

}
