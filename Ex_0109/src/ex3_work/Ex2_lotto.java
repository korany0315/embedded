package ex3_work;

import java.util.Random;

public class Ex2_lotto {
	public static void main(String[] args) {

		// 1 ~ 45 사이의 중복되지 않는 난수 6개를 만들어 lotto배열에 담고
		// 최종적으로 lotto 배열에 담긴 값들을 출력하세요.

		// 15 2 41 17 6 9

		Random rnd = new Random();
		int[] lotto = new int[6];

		outer: for (int i = 0; i < lotto.length;) {

			lotto[i] = rnd.nextInt(45) + 1;

			// 중복값을 체크하는 반복문 // 중요!!
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					continue outer;
				}

			} // inner

			System.out.printf("%d ", lotto[i]);
			i++;

		} // outer

	}// main
}
