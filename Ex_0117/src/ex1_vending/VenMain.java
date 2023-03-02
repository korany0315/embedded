package ex1_vending;

import java.util.Scanner;

public class VenMain {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Vending ven = new Vending();
		
		System.out.println("insert coin : ");
		int money = sc.nextInt();
		
		ven.showCans(money);
		
		System.out.println("¼±ÅÃ>>");
		String select = sc.next();
		
		ven.outCan(select);
		
		
		
		
		
		
		
		
		
		
		
	}
}
