package ex2_coin;

import java.util.Random;
import java.util.Scanner;

public class Ex2_Coin_teacher {
	public static void main(String[] args) {

		// 변수 money에 10 ~ 5000 까지의 난수를 만든다.
		// 단, 1의 자리 숫자는 반드시 0으로 만든다.
		// 발생된 난수 money를 동전으로 바꿨을 때,
		// 500원, 100원, 50원, 10원짜리 동전이 각각 몇개까지 거슬러지는지 판단하는 코드를 구현
		// 단, 가능한 적은 수의 동전으로 거슬러 줄 것

		// 금액 : 2590원
		// 500원 : 5
		// 50원 : 1
		// 10원 : 4
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int[] coin = { 500, 100, 50, 10 };

		int money = rnd.nextInt(500) + 1;
		money *= 10;
		
		System.out.println("금액 : " + money);

		for (int i = 0; i < coin.length; i++) {

			int res = money / coin[i];
			if (res > 0) {

				System.out.printf("%d원 : %d\n", coin[i], res);
				money %= coin[i];

			} // if

		} // for

	}// main

}
