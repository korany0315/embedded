package ex3_account;

import java.util.Scanner;

public class Atm {
	
	private int money;
	
	
	//입금
	public void deposit(int money) {
		this.money += money;
		System.out.println("입금완료");
	}
	
	
	public int withdraw(int money) {
		// 잔액부족
		if(this.money - money < 0) {
			System.out.println("출금 불가");
			return 0; //0원을 돌려주기
		}else {
			this.money -= money;
			System.out.println("출금 성공");
		}
		return money;
		
	}
	
	//잔액
	public void showMoney() {
		System.out.println("잔액 : " + money);
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
//			System.out.println("입금액 : ");
//			int money = sc.nextInt();
//			this.money += money; 
//			System.out.println("입금성공");
//			
//		}else if(select == 2) {
//			System.out.println("출금액 : ");
//			int money = sc.nextInt();
//			this.money -= money; 
//			System.out.println("출금성공");
//			
//		}else if(select == 3) {
//			System.out.println("잔액 : " + money);
//		}else {
//			System.out.printf("atm 종료");
//		}
//			
//		
//	}
//	
	
	
	

}
