package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		
		
		// Ű���忡�� �������� �Է¹ް� �Է¹��� ���ڰ� �Ҽ����� �Ǵ��ϼ���
		// ��, Ű���忡�� 1�� �޾Ҵٸ� '1�� �Ҽ� �ƴ�' ����ϱ�
		
		// �� : 5
		// 5 ��(��) �Ҽ��Դϴ�.
		
		// �� : 6
		// 6 ��(��) �Ҽ��� �ƴմϴ�. 
		
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
// 		2�� 3�� �����ϰ� ���������� %2,%3���� 0�� ���Ե��� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �� -------------------------");
		
		System.out.print("�� : ");
		int n = sc.nextInt();
		
		int i = 0;
		// �Ϻη� i�� ���������� ����
		for(i = 2; i<=n; i++) {
			if( n % i ==0 ) {
				break;
			}
		}
		
		if( i == n ) {
			 System.out.println(n + "��(��) �Ҽ�");
		}else {
			System.out.println(n + "��(��) �Ҽ� �ƴ�");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("�� �� --------------------");
//		System.out.print("�� : ");
//			int num = sc.nextInt();
//			if( num % 2 ==0  || num % 3 == 0 ) {
//				System.out.print(num + "�� �Ҽ��Դϴ�");
//			}else if( num == 2 || num==3 ) {
//				System.out.println(num + "�� �Ҽ��Դϴ�.");
//				
//			}else if( num == 1) {
//				System.out.println("1�� �Ҽ��� �ƴմϴ�.");
//			}else {
//				System.out.println(num + "�� �Ҽ��Դϴ�.");
//			}
		
		
	}
}
