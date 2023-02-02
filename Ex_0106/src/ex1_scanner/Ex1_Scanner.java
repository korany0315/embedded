package ex1_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		
		// Scanner : 키보드에서 값을 입력받을 수 있도록 해주는 클래스
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println("입력받은 값 : "+ num);
		
		System.out.print("문장 : ");
		String str = sc.next(); // next는 오류가 날 일이 없음
								// 숫자123를 써도 문자로 인식함 "123"
		System.out.println("결과 : "+ str);
		
		
		
		
		
		
		
		
	}//main
}





















