package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		// String class 은 두가지의 특징을 가지고 있다.
		// 1) 객체 생성 방법이 두가지 (암시적, 명시적)
		// 2) 한번 생성된 문자열의 내용은 변하지 않는다. (불변의 특징)
		
		// 앞글자가 대문자인 클래스로 만든것은 변수가 아닌 객체 이다!
		// s1 = 객체
		// 사실 변수가 아니지만 String만 변수라고 불러도 괜찮음
		// (Scanner sc의 sc도 객체임)
		
		// 암시적 객체생성
		String s1 = "abc"; 
		String s2 = "abc";
		
		// 명시적 객체 생성
		String s3 = new String("abc"); 
		String s4 = new String("abc"); 
		
		// ==은 기본 자료형 끼리 비교하는 경우 값을 비교
		// 객체간의 == 비교는 주소값을 비교한다!!
		// 명시적으로 객체가 생성되면 우리 눈에 같아도 주소값이 달라서 같지 않다
		if(s1 == s2) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다.");
		}
		
		// String 클래스는 객체간 주소비교 보다 값을 비교하는 경우가 훨씬 많다
		if(s1.equals(s3)) { //==이 아닌 .euals(비교할 값)을 쓴다.
		System.out.println("값이 같습니다.");	
		}
		
		System.out.println("---------------------------");
		
		Scanner sc = new Scanner(System.in);
//		s3 = sc.next(); // 값에 abc를 넣었다고 가정
		
		//오류
//		if( s1 == s3 ) {
//			System.out.println("같습니다.");
//		}
		
		// .equals
		if(s1.equals(s3)) {
			System.out.println("같습니다.");
		}
		
		
		
		
		System.out.println("---------------------------");	
		
		// 이어 붙이기
		// 한번 만든 문자열은 불변하다
		
		String greet = "안녕";
		greet += "하세요";
		
		System.out.println(greet);
		
		
		System.out.println("---------------------------");	
		// 
		
		s1 = "bbb";
		s2 = "bbb";
		s2 = "ccc";
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}


















