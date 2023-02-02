package ex3_account;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class User {
	public static void main(String[] args) {

		Atm atm = new Atm();
		int money = 0;

		Scanner sc = new Scanner(System.in);

		// 종료 버튼을 누르기 전까지 while문 안에서 무한 반복
		out: while (true) {

			System.out.println("1. 입      금 : ");
			System.out.println("2. 출      금 : ");
			System.out.println("3. 잔액확인 : ");
			System.out.println("etc. 종  료 : ");
			System.out.println(">> ");
			int select = sc.nextInt();

			switch (select) {

			case 1: // 입금
				System.out.println("---입금---");
				System.out.print("입금액 : ");
				money = sc.nextInt();
				atm.deposit(money);
				break;
				
			case 2: // 출금
				System.out.println("---출금---");
				System.out.print("출금액 : ");
				money = sc.nextInt();
				money = atm.withdraw(money);
				
				break;

			case 3: // 잔액
				System.out.println("---잔액---");
				atm.showMoney(); //메서드 호출
				break;

			default: // 종료
				System.out.println("atm을 종료합니다");
				break out;
			}//switch

			System.out.println("--------------------");
		} // while

	}// main
}
