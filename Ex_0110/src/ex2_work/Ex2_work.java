package ex2_work;

import java.util.Scanner;

public class Ex2_work { 
	public static void main(String[] args) {

		// ������
		// Ű���忡�� �Է¹��� �� ��ŭ�� ��� ���� ������ ������ �����

		// ������ : 3 (Ȧ��)
		// 08 01 06
		// 03 05 07
		// 04 09 02
		Scanner sc = new Scanner(System.in);
	
		
//		 ������ ��
		int[][] arr; //ũ�⸦ �������� ����
		
		//���� �ڸ��� ��� �����ϴ°� ����
		int num = 1; // ���ۼ�
		int y = 0; // ������(��) ����
		int x = 0; // ������(��) ����
		
		System.out.print("������: ");
		int size = sc.nextInt();
		
		x = size / 2;  //1�� ����� ��� ����_
		
		// �迭�� ũ�� 
		arr = new int[size][size];
		
		// �������� �׸� while��
		while(num <= size * size ) {
			
			arr[y][x] = num; // ��Ģ�� ���缭 ���� ä��� ���
			
			if( num % size == 0) { // �����ϴ¼��� ������ �������� �������?
				y++;
				
			}else {  //������ƴҶ�
				y--;
				x++;
			}
			if( y < 0 ) { //����ĭ ���� ��
				y = size - 1;
			}
			if( x >= size) { //������ ĭ ���� ��
				x = 0;
			}
			
			num++;

		}
		
		// arr�迭�� ��� ��簪�� ���
		for(int i=0; i<size; i++) {
			
			for(int j = 0; j<size; j++) {
				
				System.out.printf("%02d�� ",arr[i][j]);
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("----------------------------------------------");
//		// �� ��
//		
//		int a = sc.nextInt();
//		int[][] b = new int[a][a];
//		int i = 0, j = a / 2, v = 1; // ������
////		b[0][a/2]=c++; //���۰� ù�� �Ѱ�� �α�
////		for (int i = a-1; i >=0 ; i--) { // 2 1 0 
////			for (int j = 0; j < a; j++) { // 0 1 2 
////				b[i][j] = c++;
////			}
////			System.out.println();
////		}
//		while (true) { // ���ѷ���
//			if (i < 0)
//				i = a - 1; // ���� ù�ຸ�� �۾����� ��� ���������� �Ѿ��.
//			if (j == a)
//				j = 0; // ���� ������������ Ŀ���� ��� ù ���� �Ѿ��.
//			if (b[i][j] == 0) {
//				b[i][j] = v;
//			}
//			if (v % a == 0) {// ���� ���� ����̸� �ุ ����
//				i++;
//			} else {
//				i--;// 2 1 1 2
//				j++;// 2 0 0 0
//			}
//			v++;
//			if (v == a * a + 1)
//				break;// ��������
//		} // while
//
//		for (int k = 0; k < a; k++) {
//			for (int k2 = 0; k2 < a; k2++) {
//				System.out.print(b[k][k2]);
//			}
//			System.out.println();
//		}
		System.out.println("----------------------------------------------");
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("������� �������� ����ðڽ��ϱ�? ");
//		int num = sc.nextInt();
//
//		int[][] arr = new int[num][num];
//		int res = 0 ;
//		int [] arr2  = new int[num*num];
//		arr2[] = res+1;
//		
//		arr[0][num / 2] = 1;
//		int mult = num * num;
//
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = 0; j < arr[i].length; j++) {
//
//				if (mult % num == 0 && i + 1 < num) { // num�� ����� ��
//					arr[i][j] = arr[i + 1][j];
//
//				} else if (mult % num != 0) { // num�� ����� �ƴ� ��
//					arr[i][j] = arr[i - 1][j + 1]; // ���� ��ĭ ���������� ��ĭ
//
//					if (j - num == -1) { // ������ ĭ�� ���� ��
//						arr[i][j] = arr[i][j - num];
//					}
//					if (i == 0) { // ���� ĭ�� ���� ��
//						arr[i][j] = arr[i - 1][j];
//					}
//				}
//				System.out.printf("arr[i][j]\t", arr[i][j]);
//				
//			}//inner
//
//			System.out.println();
//
//		}//outer
//		

	}// main
}
