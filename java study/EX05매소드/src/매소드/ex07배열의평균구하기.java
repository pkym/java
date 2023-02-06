package 매소드;

public class ex07배열의평균구하기 {

	public static void main(String[] args) {
		// 정수형 배열
		// 추가문제. 평균값의 소수점 두번째 자리수까지만 나오게하세요
		int[] array = { 50,20,30 };		

		double average = getAverage(array);
		
		System.out.println("array의 평균은: " + average);
		

	}

	public static double getAverage(int[] array) {
		double sum = 0, avg = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum / array.length;
		int temp=(int)(avg*100);       //3333이 담겨져있음
		double result=temp*0.01;
		
		return result;
	}
	

}
