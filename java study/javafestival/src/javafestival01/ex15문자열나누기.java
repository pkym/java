package javafestival01;

import java.lang.reflect.Array;

public class ex15문자열나누기 {

	public static void main(String[] args) {
		// 학생정보가 문자열로 선언되어 있을 떄 각 성적 별 학생 수를 출력하세요

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] abc = score.split(",");
		int cntA = 0, cntB = 0, cntC = 0, cntD = 0, cntF = 0;

		for (int i = 0; i < abc.length; i++) {
			switch (abc[i]) {
			case "A":
				cntA++;
				break;
			case "B":
				cntB++;
				break;
			case "C":
				cntC++;
				break;
			case "D":
				cntD++;
				break;
			case "F":
				cntF++;
				break;
			}

		}

		System.out.println("A : " + cntA + "명");
		System.out.println("B : " + cntB + "명");
		System.out.println("C : " + cntC + "명");
		System.out.println("D : " + cntD + "명");
		System.out.println("F : " + cntF + "명");

//		for (char i = 'A'; i <= 'F'; i++) {
//			int cnt = 0;
//			for (int j = 0; j < score.length(); j++) {
//
//				if (score.charAt(j) == i)
//					cnt++;
//			}
//			if (cnt != 0)
//				System.out.println(i + "는 " + cnt + "명");
//		}

//		
//		int cntA=0;
//		int cntB=0;
//		int cntC=0;
//		int cntD=0;
//		int cntF=0;
//		
//		for(int i=0;i<score.length();i++) {
//			if(score.charAt(i)=='A') {
//				cntA++;
//			}else if(score.charAt(i)=='B') {
//				cntB++;
//			}else if(score.charAt(i)=='C') {
//				cntC++;
//			}else if(score.charAt(i)=='D') {
//				cntD++;
//				
//			}else if(score.charAt(i)=='F') {
//				cntF++;
//			}
//		}
//		System.out.println("A: "+cntA+"명");
//		System.out.println("B: "+cntB+"명");
//		System.out.println("C: "+cntC+"명");
//		System.out.println("D: "+cntD+"명");
//		System.out.println("F: "+cntF+"명");
//		

	}

}
