package ex3_account;

import java.util.Scanner;

public class Atm {
	
	private int money;
	
	
	//�Ա�
	public void deposit(int money) {
		this.money += money;
		System.out.println("�ԱݿϷ�");
	}
	
	
	public int withdraw(int money) {
		// �ܾ׺���
		if(this.money - money < 0) {
			System.out.println("��� �Ұ�");
			return 0; //0���� �����ֱ�
		}else {
			this.money -= money;
			System.out.println("��� ����");
		}
		return money;
		
	}
	
	//�ܾ�
	public void showMoney() {
		System.out.println("�ܾ� : " + money);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public int getMoney() {
//		return money;
//	}
//
//	public void setMoney(int money) {
//		this.money = money;
//	}
//	
//
//	Scanner sc = new Scanner(System.in);
//	
//	public void in(int select) {
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void atm(int select) {
//		
//		if(select == 1) {
//			System.out.println("�Աݾ� : ");
//			int money = sc.nextInt();
//			this.money += money; 
//			System.out.println("�Աݼ���");
//			
//		}else if(select == 2) {
//			System.out.println("��ݾ� : ");
//			int money = sc.nextInt();
//			this.money -= money; 
//			System.out.println("��ݼ���");
//			
//		}else if(select == 3) {
//			System.out.println("�ܾ� : " + money);
//		}else {
//			System.out.printf("atm ����");
//		}
//			
//		
//	}
//	
	
	
	

}
