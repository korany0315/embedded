package ex8_work;

import java.util.Scanner;

public class SnackChage_solo {
	public static void main(String[] args) {
		
		
//		�⺻�ڷ����� ������ ����
		
//		����ڰ� ���� ������ �ִ� ���� �Է¹ް�, ũ����, �����, �ݶ� �ܵ��� �ϳ��� ������ �ʰ�
//		�����ϴ� ����� ���� ��� ����ϱ�. ��, ������� �ʴ� ��ǰ�� ������ �ȵȴ�.
//		ũ���� 500��, ����� 700��, �ݶ� 400��. 
		
//		��� :
//		����� ������ �ݾ� : 4000
//		ũ���� : 1��, ����� : 1����, �ݶ� : 7ĵ
//		ũ���� : 2��, ����� : 2����, �ݶ� : 4ĵ
//		ũ���� : 3��, ����� : 3����, �ݶ� : 1ĵ
//		ũ���� : 5��, ����� : 1����, �ݶ� : 2ĵ
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ �ݾ� : ");
		int money = sc.nextInt();
		
		// ����� ��
		// ���� �ݾ��� ū ���� ����� 700��
		// ������� ������ +1 => ũ������ �þ�� ����� �� => �ܵ����� ���� �ݶ��
		// ����� + ũ���� + �ݶ� == money ? ����� �����ֱ�
		int sMoney = 700;
		int bMoney = 500;
		int cMoney = 400;
		
		
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
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}//main

}
