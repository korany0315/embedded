package ex2_coin;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Coin {
	public static void main(String[] args) {
		
		// ���� money�� 10 ~ 5000 ������ ������ �����.
		// ��, 1�� �ڸ� ���ڴ� �ݵ�� 0���� �����.
		// �߻��� ���� money�� �������� �ٲ��� ��,
		// 500��, 100��, 50��, 10��¥�� ������ ���� ����� �Ž��������� �Ǵ��ϴ� �ڵ带 ����
		// ��, ������ ���� ���� �������� �Ž��� �� ��
		
		// �ݾ� : 2590��
		// 500�� : 5
		// 50�� : 1
		// 10�� : 4
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int[] coin = { 500, 100, 50, 10};
		
		
		int money = 0;
		//money�� 1�� �ڸ����� 0�� �ǰ� �����
		do { 
			
			money = rnd.nextInt(4991)+10;
			
		}while(money % 10 != 0);	
		
		System.out.println("�ݾ� : " + money +"��");
		
		for( int i = 0; i<=coin.length; i++ ) {
			
			if( money / coin[i] >= 1) {
				System.out.printf(" 500�� : %d", (money / coin[i]) );
			}
			
			
		}//for
		
		
	}//main
}
