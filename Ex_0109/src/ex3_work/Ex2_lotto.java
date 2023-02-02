package ex3_work;

import java.util.Random;

public class Ex2_lotto {
	public static void main(String[] args) {

		// 1 ~ 45 ������ �ߺ����� �ʴ� ���� 6���� ����� lotto�迭�� ���
		// ���������� lotto �迭�� ��� ������ ����ϼ���.

		// 15 2 41 17 6 9

		Random rnd = new Random();
		int[] lotto = new int[6];

		outer: for (int i = 0; i < lotto.length;) {

			lotto[i] = rnd.nextInt(45) + 1;

			// �ߺ����� üũ�ϴ� �ݺ��� // �߿�!!
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
