package ex1_string;

public class Ex2_String_Method {
	public static void main(String[] args) {
		
		// String클래스 메서드(기능)들
		// 메서드란 어떤 작업을 수행하기 위한 명령문의 집합
		// 반복적으로 사용되는 코드를 줄이기 위해 쓰는 개념
		
		String name = "Hong Gil Dong";
		int len = name.length();
		System.out.println("문장의 길이: " + len);
		// length :유일하게 1부터 셈!
		
		int index = name.indexOf('o');
		System.out.println("맨 첫번째 o의 위치 : " +index);
		// 숫자는 0부터 셈
		
		index = name.lastIndexOf('o');
		System.out.println("맨 뒤에 있는 o의 위치 : "+ index);
		
		char c = name.charAt(5);
		//charAt(int index) : ( )안에 데이터를 안 넣으면 오류 
							// 정수 타입의 값을 넣어야 함 
		System.out.println("추출한 문자 :" + c);
		
		String s1 = name.substring(5);
		System.out.println("5번 이전의 모든 문자를 잘라내시오 : " + s1);
		
		s1 = name.substring(5, 10);
		System.out.println("5 ~ 9까지의 문장을 잘라내시오 : " + s1);
		
		name = "Hong. Gil. Dong";
		s1 = name.replace('.', '/');
		System.out.println(".을 /로 치환 : " + s1);
		
		s1 = name.replace("on", "il");
		System.out.println("on을 il로 치환 : " + s1);
		
		// 영구적으로 이름 바꾸기
		name = name.replace("on", "il");
		System.out.println("on을 il로 치환 : " + name);
		
		name = name.replaceAll("il", "on");
		System.out.println("il을 on로 치환 : " + name);
		
		name = "Kim. Lee. Park.";
		String name2 = "Kim. Lee. Park.";
		
		// replace는 all없는 걸 선호
		// replace :Kim/ Lee/ Park/
		name = name.replace('.', '/');
		System.out.println("replace :" + name);
		
		// 자바의 정규식 : .이 있을때 All 치환 처리 하면 앞의 모든 글자들을 한 묶음으로 인식함
		// replaceAll :///////////////
		name2 = name2.replaceAll(".", "/");
		System.out.println("replaceAll :" + name2);
		
		// 의미 없는 공백 제거 ex)회원가입
		String id = " hi hello ";
		id = id.trim();
		System.out.println("trim 사용 한 후 길이 : " + id.length());
		

		
		// .equalsIgnoreCase : 대소문자와 상관없이 단어만 같다면 일치시킴
		// java는 영문자의 대소문자를 구별해서 다른 값으로 인식함
		String answer = "Apple";
		
		if(answer.equalsIgnoreCase("apple")) {
			System.out.println("apple 값이 같다");
		}
		
		
		// 중요!!
		// String클래스의 메서드는 아니지만 앞으로 많이 사용하게 될 메서드
		// 정수형태의 문자열(String)을 진짜 숫자로 만들어주는 메서드!
		String num = "True";
//		int a = 10;
		float c1 = 0; boolean b = false;
		int a = Integer.parseInt(num); //Integer : 클래스
		c1 = Float.parseFloat(num);
		
			
		System.out.println( b );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//m
}
