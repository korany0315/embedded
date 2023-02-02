package ex7_work;

import java.util.Scanner;

public class CalMain_tea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수1 : ");
		int su1 = sc.nextInt();
		
		System.out.println("수2 : ");
		int su2 = sc.nextInt();
		
		System.out.println("연산자 : ");
		String op = sc.next();
		
		Calculator_tea cal = new Calculator_tea(); //메모리 할당 받음
		cal.getResult(op, su1,su2);
		
		
		
	}

}
