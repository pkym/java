package ex01변수;

public class EX02기본변수 {
	
	public static void main(String[] args) {
		//java의 자료형
		//1.기본타입(primitive, basic)
		//정수타입(byte, short, int, long)
		
		//byte - 1byte or 8 bit
		byte num1 = 127;
		
		//short - 2byte, 16 bit 
		short num2 = 11111;
		
		//int - 4 byte, 32 bit
		int num3 = 12345678;
		
		//long - 8byte or 64bit
		long num4 = 3000000000L;
		
		//실수타입(float, double)
		
		//float - 4 byte, 32bit
		float num5 = 3.14F;
		
		//double - 8 byte, 64bit
		double num6 = 1.11433;
		
		//논리타입(boolean)
		
		//boolean - 1 byte, 8bit
		boolean isCheck1 = true;
		boolean ischeck2 = false;
		
		//문자형(숫자형) - char
		//char - 2byte or 16bit
		//문자: 한글자만 해당, ''
		//문자열: 한글자 포함 두글자 이상의 글자, ""
		char text='가'+1;
		System.out.println(text);
		
		//기본자료형은 아니지만 문자열을 담을 수 있는 변수
		String name ="기영민";
		
		
		//2. 참조타입(reference)
	}

}
