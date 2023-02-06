package 상속기초;

public class Main {

	public static void main(String[] args) {
		// Parent p 객체 생성
		// Child c 객체 생성
		
		Parent p =new Parent();
		Child c =new Child();
		
		p.makeKimchi();		
		//상속만 했을 때는 child class로 가서 
		//상속확인해서 parent class로 감
		c.makeKimchi();
		//오버로딩시에는 굳이 parent class 까지 갈 필요 X
		c.makeKal();
		
		p.makeKimchi();

	}

}
