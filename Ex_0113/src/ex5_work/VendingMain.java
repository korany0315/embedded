package ex5_work;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		// 음료수마다의 가격과 이름 세팅 클래스 배열로도 만들어보기
		
		// 키보드에서 금액을 입력받고
		// 해당 금액 범위 안에서 마실 수 있는 음료의 목록만 화면에 출력
		// 음료를 선택하면 제공 및 잔액을 반환
		
		// insert coin : 1000
		// fanta - 1000
		// coke - 900
		// sider - 900
		// >> coke
		// coke (을)를 선택하셨습니다.
		// 잔액 : 100원
		Scanner sc = new Scanner(System.in);
		Vending ven = new Vending();
		ven.canInit();
		
		System.out.println("insert coin : ");
		int money = sc.nextInt();
		
		ven.showCans(money); // 마실 수 있는 음료수 목록
		
		System.out.print(">> ");
		
		String select = sc.next(); //음료수 이름 입력
		
		//음료제공 및 잔돈 반환
		ven.outCan(select);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
