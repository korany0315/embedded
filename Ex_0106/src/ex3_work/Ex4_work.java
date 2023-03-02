package ex3_work;

public class Ex4_work {
	public static void main(String[] args) {

		int num = 1;
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 10; j++) {

				System.out.print(num++ + "\t"); // \t : 강제 tab키
				/*
				 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29
				 * 30
				 * 
				 */

			} // inner

			System.out.println();

		} // outer

		System.out.println("Q1) 2중 for문을 이용하여 구구단 만들기------------");

		// 2 * 1 = 2 3 * 1 = 3 4 * 1 = 4 ... 9 * 1 = 9
		// 2 * 2 = 4 3 * 2 = 6 4 * 2 = 8
		// 2 * 3 = 6 3 * 3 = 9
		// 2 * 4 = 8 3 * 4 = 12
		// ...
		// 2 * 9 = 18

		int mlt = 1;
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {
				mlt = i * j;
				System.out.printf("%d * %d = %d \t", j, i, mlt);
			}
			System.out.println();
		} // outer

	}// main
}
