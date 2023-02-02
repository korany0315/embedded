package ex1_baseball;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Baseball {
	public static void main(String[] args) {

		// 1 ~ 9 중에 겹치지 않도록 숫자 세개를 만들어서 컴퓨터만 알고있는다.

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int com1, com2, com3;
		int u1, u2, u3;

		do {
			// 중복되지 않는 세개의 난수를 만들자!
			com1 = rnd.nextInt(9) + 1;
			com2 = rnd.nextInt(9) + 1;
			com3 = rnd.nextInt(9) + 1;

		
		} while (com1 == com2 || com1 == com3 || com2 == com3);

		System.out.println("정답 : " + com1 + com2 + com3);
		
		int num = 1;
		while (true) {
			// 의도적으로 정답이 나올때까지 무한 반복시키기

			// 정답이라고 생각하는 세 자리의 수를 입력받는다.
			System.out.print("수1 : ");
			u1 = sc.nextInt();

			System.out.print("수2 : ");
			u2 = sc.nextInt();

			System.out.print("수3 : ");
			u3 = sc.nextInt();

			// 스트라이크와 볼 갯수를 저장할 변수
			int strike = 0;
			int ball = 0;

			// 정답처리를 위한 경우의 수
			// 100의자리 경우의 수
			if (u1 == com1) {
				strike++;
			} else if (u1 == com2 || u1 == com3) {
				ball++;
			}

			// 10의 자리 경우의 수
			if (u2 == com2) {
				strike++;
			} else if (u2 == com1 || u2 == com3) {
				ball++;
			}

			// 1의자리 경우의 수
			if (u3 == com3) {
				strike++;
			} else if (u3 == com1 || u3 == com2) {
				ball++;
			}

			// 정답 처리
			if (strike == 3) {
				System.out.printf("%d회 만에 정답 입니다~!!", num);
				break; // 정답을 맞추면 while문을 빠져 나오도록 함

			} else {
				if (strike == 0 && ball == 0) {
					// out을 판단하는 if문
					System.out.println("out!");
				} else {
					// out이 아닌 경우
					System.out.printf("%dStrike, %dBall\n", strike, ball);
				}

			}

			System.out.println("-------------------------------");
			num++;

		} // while

	}// main
}
