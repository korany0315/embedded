package ex8_work;

public class SnackChange {
	
	// ����� ��
	// ���� �ݾ��� ū ���� ����� 700��
	// ������� ������ +1 => ũ������ �þ�� ����� �� => �ܵ����� ���� �ݶ��
	// ����� + ũ���� + �ݶ� == money ? ����� �����ֱ�
	int sMoney = 700;
	int bMoney = 500;
	int cMoney = 400;
	int money = 0;
	
	public void snack() {

				// ������� ����� �� i == ����� ����
				for(int i = 1; (money - sMoney*i) > 0 ; i++ ) {
					
					// ũ������ ����� ��  j == ũ���� ����
					for(int j = 1; ( money - bMoney*j) > 0 ; j++) {
						
						// �ݶ��� ����� �� k == �ݶ��� ����
						for(int k = 1; money - cMoney*k >0; k++) {
							
							if( sMoney*i + bMoney*j + cMoney*k == money ) {						
								System.out.printf("ũ���� : %d��, ����� : %d����, �ݶ� : %dĵ\n", j, i, k);
								
							}//if
							
						}//k
				
					}//j

				}//i
				

	}
	

}//
