package ex7_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		// 수1, 수2 연산자를 Calculator의 getResult()메서드로 전달하여
		// 결과를 출력하세요
		
		// 수 1 : 5
		// 수 2 : 2
		// 연산자 : +
		// 5 + 2 = 7
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1: ");
		int su1 = sc.nextInt();
		System.out.print("수2: ");
		int su2 = sc.nextInt();
		System.out.print("연산자: ");
		String a = sc.next();
		
		Calculator cal = new Calculator();
		int result = cal.getResult(su1, su2,a);
		System.out.println("결과값은 " + result);
		
	}

}
