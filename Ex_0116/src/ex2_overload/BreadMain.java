package ex2_overload;

import java.util.Scanner;

public class BreadMain {
	public static void main(String[] args) {
		
		Bread bread = new Bread();
		Scanner scanner = new Scanner(System.in);
		
		
		// makeBread() 1번 호출시
		// 빵을 만들었습니다.
		bread.makeBread();
		System.out.println("----------------------");
		
		// makeBread() 2번 호출시
		// 빵을 만들었습니다.
		// 빵을 만들었습니다.
		// 2개의 빵을 만들었어요
		System.out.print("빵의 개수를 입력하세요 : \n");
		int n = scanner.nextInt();
		bread.makeBread(n);
		System.out.println("----------------------");
		// makeBread() 3번 호출시
		// 크림빵을 만들었습니다.
		// 크림빵을 만들었습니다.
		// 크림빵을 만들었습니다.
		// 3개의 크림빵을 만들었어요
		
		System.out.print("빵의 개수를 입력하세요 :\n");
		int n2 = scanner.nextInt();
		System.out.print("빵의 종류를 입력하세요: \n");
		String s = scanner.next();
		bread.makeBread(s,n);
		System.out.println("----------------------");
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
