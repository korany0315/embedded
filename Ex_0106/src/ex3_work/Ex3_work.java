package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		
		
		// 키보드에서 정수값을 입력받고 입력받은 숫자가 소수인지 판단하세요
		// 단, 키보드에서 1을 받았다면 '1은 소수 아님' 출력하기
		
		// 값 : 5
		// 5 은(는) 소수입니다.
		
		// 값 : 6
		// 6 은(는) 소수가 아닙니다. 
		
//
//		2 %2=0 %3=1
//		3 %2=1 %3=0
//					4 %2=0 %3=1 
//		5 %2=1 %3=2
//					6 %2=0 %3=0
//		7 %2=1 %3=1
//					8 %2=0 %3=2
//					9 %2=1 %3=0
//					10 %2=0 %3=1
//		11 %2=1 %3=2
//
// 		2와 3을 제외하고 나머지값에 %2,%3에도 0이 포함되지 않음
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("선생님 식 -------------------------");
		
		System.out.print("값 : ");
		int n = sc.nextInt();
		
		int i = 0;
		// 일부러 i를 전역변수로 만듬
		for(i = 2; i<=n; i++) {
			if( n % i ==0 ) {
				break;
			}
		}
		
		if( i == n ) {
			 System.out.println(n + "은(는) 소수");
		}else {
			System.out.println(n + "은(는) 소수 아님");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("내 식 --------------------");
//		System.out.print("값 : ");
//			int num = sc.nextInt();
//			if( num % 2 ==0  || num % 3 == 0 ) {
//				System.out.print(num + "는 소수입니다");
//			}else if( num == 2 || num==3 ) {
//				System.out.println(num + "는 소수입니다.");
//				
//			}else if( num == 1) {
//				System.out.println("1은 소수가 아닙니다.");
//			}else {
//				System.out.println(num + "은 소수입니다.");
//			}
		
		
	}
}
