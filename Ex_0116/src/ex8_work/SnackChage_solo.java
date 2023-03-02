package ex8_work;

import java.util.Scanner;

public class SnackChage_solo {
	public static void main(String[] args) {
		
		
//		기본자료형과 연산자 문제
		
//		사용자가 현재 가지고 있는 돈을 입력받고, 크림빵, 새우깡, 콜라를 잔돈을 하나도 남기지 않고
//		구입하는 경우의 수를 모두 출력하기. 단, 사용하지 않는 상품이 있으면 안된다.
//		크림빵 500원, 새우깡 700원, 콜라 400원. 
		
//		결과 :
//		당신이 소유한 금액 : 4000
//		크림빵 : 1개, 새우깡 : 1봉지, 콜라 : 7캔
//		크림빵 : 2개, 새우깡 : 2봉지, 콜라 : 4캔
//		크림빵 : 3개, 새우깡 : 3봉지, 콜라 : 1캔
//		크림빵 : 5개, 새우깡 : 1봉지, 콜라 : 2캔
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 소유한 금액 : ");
		int money = sc.nextInt();
		
		// 경우의 수
		// 가장 금액이 큰 과자 새우깡 700원
		// 새우깡의 봉지수 +1 => 크림빵도 늘어나는 경우의 수 => 잔돈에서 남은 콜라수
		// 새우깡 + 크림빵 + 콜라 == money ? 결과를 보여주기
		int sMoney = 700;
		int bMoney = 500;
		int cMoney = 400;
		
		
		// 새우깡의 경우의 수 i == 새우깡 개수
		for(int i = 1; (money - sMoney*i) > 0 ; i++ ) {
			
			// 크림빵의 경우의 수  j == 크림빵 개수
			for(int j = 1; ( money - bMoney*j) > 0 ; j++) {
				
				// 콜라의 경우의 수 k == 콜라의 개수
				for(int k = 1; money - cMoney*k >0; k++) {
					
					if( sMoney*i + bMoney*j + cMoney*k == money ) {						
						System.out.printf("크림빵 : %d개, 새우깡 : %d봉지, 콜라 : %d캔\n", j, i, k);
						
					}//if
					
				}//k
		
			}//j

		}//i
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}//main

}
