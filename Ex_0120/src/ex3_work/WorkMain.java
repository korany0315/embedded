package ex3_work;

import java.util.Scanner;


public class WorkMain {
	public static void main(String[] args) {
		
		/*
		 * 아래와 같은 결과를 출력하되,
		 * 	try-catch 구문을 사용하지 않고 코드를 작성해 보세요
		 	정수 : 123
		 	123은 정수입니다.
		 	
		 	정수 : ab91
		 	ab91은 정수가 아님
		 */
		

		 Scanner sc = new Scanner(System.in);
		 System.out.println("정수를 입력하세요");
		 String str = sc.next(); //원본데이터
		 
		 Work work = new Work();
		 String ss = work.isNumber(str);
		 System.out.println(ss);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
