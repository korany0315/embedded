package ex9_break_continue;

public class Ex4_Continue {
	public static void main(String[] args) {

		int n = 0;
		while (n < 5) {
			n++;

			if (n % 2 == 0) {
				continue; // while�� ������ continue�� ���� ����� while���� ���ǽ����� �̵�
							// ���������� ���� ����

			}
			System.out.println(n);

		} // while

		int num = 0;

		for (num = 0; num < 3; num++) {
			// switch���� �ݺ����� �ƴϱ� ������ �ܵ� switch�� ������ continue�� ���Ұ�
			// ������ for �� ������ switch�� �� continue�� for���� ���������� �̵��Ѵ�.
			switch (num) {
			case 0:
				System.out.println("0�̾�");
				continue;

			case 1:
				System.out.println("1�̾�");
				continue;
			}// switch

		}// for

	}// main
}
