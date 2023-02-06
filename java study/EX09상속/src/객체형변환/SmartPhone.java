package 객체형변환;

public class SmartPhone extends Phone {

	// 자식클래스, 서브클래스

	public void wifi() {
		System.out.println("인터넷 연결");
	}

	// 메소드 오버라이딩
	@Override //annotation 표시기능
	public void message() {
		System.out.println("카카오톡 보내기");
	}

}
