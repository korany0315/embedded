package ex7_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		// ��1, ��2 �����ڸ� Calculator�� getResult()�޼���� �����Ͽ�
		// ����� ����ϼ���
		
		// �� 1 : 5
		// �� 2 : 2
		// ������ : +
		// 5 + 2 = 7
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��1: ");
		int su1 = sc.nextInt();
		System.out.print("��2: ");
		int su2 = sc.nextInt();
		System.out.print("������: ");
		String a = sc.next();
		
		Calculator cal = new Calculator();
		int result = cal.getResult(su1, su2,a);
		System.out.println("������� " + result);
		
	}

}
