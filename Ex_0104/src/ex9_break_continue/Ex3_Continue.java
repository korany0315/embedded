package ex9_break_continue;

public class Ex3_Continue {
	public static void main(String[] args) {

		// continue�� : �ݺ��� ������ Ư�� ������ �����ϰ� �ǳʶٰ��� �� �� ����ϴ� Ű����

		for (int i = 1; i <= 2; i++) {

			for (int j = 0; j <= 5;) {
				
				j++;
				if (j % 2 == 0) {
					// for�� ������ continue�� ������
					// ���� ����� for���� ���������� ����
					// ���� for������ �ǵ������� �������� �����ߴٸ�,
					// �ش� for���� ���ǽ����� �ǳʶڴ�.
					continue;
					// System.out.println("������ �� ���� �ڵ�");
				}
				System.out.printf("%d ", j);
			}
			System.out.println();
		}

	}// m
}
