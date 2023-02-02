package ex8_work;

public class SnackChange {
	
	// 경우의 수
	// 가장 금액이 큰 과자 새우깡 700원
	// 새우깡의 봉지수 +1 => 크림빵도 늘어나는 경우의 수 => 잔돈에서 남은 콜라수
	// 새우깡 + 크림빵 + 콜라 == money ? 결과를 보여주기
	int sMoney = 700;
	int bMoney = 500;
	int cMoney = 400;
	int money = 0;
	
	public void snack() {

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
				

	}
	

}//
