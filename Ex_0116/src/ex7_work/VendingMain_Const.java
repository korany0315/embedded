package ex7_work;

import java.util.Scanner;

public class VendingMain_Const {
	public static void main(String[] args) {
		// ����������� ���ݰ� �̸� ���� Ŭ���� �迭�ε� ������
		
		// Ű���忡�� �ݾ��� �Է¹ް�
		// �ش� �ݾ� ���� �ȿ��� ���� �� �ִ� ������ ��ϸ� ȭ�鿡 ���
		// ���Ḧ �����ϸ� ���� �� �ܾ��� ��ȯ
		
		// insert coin : 1000
		// fanta - 1000
		// coke - 900
		// sider - 900
		// >> coke
		// coke (��)�� �����ϼ̽��ϴ�.
		// �ܾ� : 100��
		Scanner sc = new Scanner(System.in);
		Vending_Const ven = new Vending_Const();
		ven.canInit();
		
		System.out.println("insert coin : ");
		int money = sc.nextInt();
		
		ven.showCans(money); // ���� �� �ִ� ����� ���
		
		System.out.print(">> ");
		
		String select = sc.next(); //����� �̸� �Է�
		
		//�������� �� �ܵ� ��ȯ
		ven.outCan(select);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
