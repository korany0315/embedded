package ex9_break_continue;

public class Ex4_Continue {
	public static void main(String[] args) {

		int n = 0;
		while (n < 5) {
			n++;

			if (n % 2 == 0) {
				continue; // while문 내부의 continue는 가장 가까운 while문의 조건식으로 이동
							// 증감식으로 가지 않음

			}
			System.out.println(n);

		} // while

		int num = 0;

		for (num = 0; num < 3; num++) {
			// switch문은 반복문이 아니기 때문에 단독 switch만 있으면 continue는 사용불가
			// 하지만 for 문 내부의 switch문 속 continue는 for문의 증감식으로 이동한다.
			switch (num) {
			case 0:
				System.out.println("0이야");
				continue;

			case 1:
				System.out.println("1이야");
				continue;
			}// switch

		}// for

	}// main
}
