package ex8_work;

import java.util.Random;

public class GraphMain {

		public static void main(String[] args) {
			
			// 0 ~ 9 ������ ������ 100�� ���� ����
			
			// 12847830584375394875309485304857....
			// 0�� ���� : ###### 6
			// 1�� ���� : ######### 9
			// ...
			// 9�� ���� : #### 4
			
			// ������ ����°� ����
			// �׷����� ����°� Ŭ����
			
			
			//Ǯ��
			
			//���������
			Random rnd = new Random();
			
			//0�� ���� 9�� ���� �迭 (10���� ��) ó���� ���0���� ����
			int[] nArr = new int[10];
			for( int i = 0; i<100; i++ ) {
				int r = rnd.nextInt(10);
				System.out.print(r);
				
				//�ٽ� ������ �þ������ nArr�迭�� �� �ش� ������ ���� �÷�������!
				nArr[r]++; 
				
			}
			System.out.println();
			// �迭�� ���濡 �ִ� ���� �� ��� ����
			
			//�޼��� ���
			PrintGraph pg = new PrintGraph();
			pg.print(nArr);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}//main
}
