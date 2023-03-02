package ex2_string;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// 회문 판단하기
		// 회문란 앞으로 읽어도 뒤에서 읽어도 똑같이 읽히는 숫자

		// 값 : a1221a
		// a1221a (은)는 회문수 입니다.

		// 값 : a1221b
		// a1221b (은)는 회문수가 아닙니다.

		System.out.println("---내 풀이--------------------");

		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		String origin = sc.next();

		String reverse = "";
		for (int i = origin.length() - 1; i >= 0; i--) {
			// reverse = reverse+origin.charAt(i);
			reverse += origin.charAt(i);

		}
		if (origin.contentEquals(reverse)) {
			System.out.println("회문수 입니다.");
		} else {
			System.out.println("회문수가 아닙니다.");
		}

//		System.out.println("---선생님 풀이--------------------");

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("값을 입력하세요");
//		String ori = sc.next(); //원본값
//		

//		String rev = "";  //String class에 값이 없을땐 빈 큰따옴표로 하는게 안전
//		
//		//원본 문자열 ori를 뒤집어서 rev 변수에 저장
//		for( int i = ori.length()-1;  i>=0;  i--) {
//
//			rev += ori.charAt(i);	//핵심 rev = String class이기 때문에 +=는 이어붙이기!
//									//뒤집어서 하나씩 이어붙이기
//		}//for
//		
//		// 앞에 !가 붙으면 같지 않으면
//		if(!ori.contentEquals( rev )) {
//			System.out.println(ori + "은(는) 회문수가 아님");
//		}else {
//			System.out.println(ori + "은(는) 회문수");
//		}
//		

	}// m

}
