package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		// 키보드에서 n1과 n2변수에 각각 정수값을 입력받습니다.
		// n1부터 n2까지의 합을 출력하세요.
		// 큰값을 먼저받아도 작은값을 먼저 받아도 결과는 같아야 한다.
		
		// 수1 : 2
		// 수2 : 5
		// 결과 : 2 + 3 + 4 + 5 = 15
		
		// 수1 : 5
		// 수2 : 1
		// 결과 : 15
		Scanner sc = new Scanner(System.in);
		
			System.out.print("수1 : ");
			int n1 = sc.nextInt();
			System.out.print("수2 : ");
			int n2 = sc.nextInt();
			
			int result = 0;
			
			// 변수끼리의 값 교환법
			// swap
			if(n1 > n2) { //n1 5  n2 1
				int n3 = n1;  //n3를 새로만들어 
				n1 = n2;  //n1 = 1
				n2 = n3;  // n2 = 5
				
			}
			
			for(int i = n1; i<=n2; i++) {  // i = 1 2 3
				result += i;   			// result = 0+1 +2 + 3
			
				
			}
			
			System.out.print("결과 : " + result);
			
			
			
			
			
			
			
//			if(n1<n2) {
//				
//				
//			}else if(n1>n2) {
//				
//			}else {
//				System.out.println("결과 : " + n1);
//			}
//			
//			
			
			
//			for (n1= 0; n1>=0; n1++) {
//				
//				if(n1<n2) {
//					int sum=0;
//					sum += n1;
//					
//					System.out.println(sum);
//					
//				}
//		
//		}
//		
		
		
		
		
		
		
		
		
		
	}//main
}
