package ex3_work;

public class Ex1_work {
	public static void main(String[] args) {


		// ����� ������ �ʱ�ȭ���� �� �ٷ� ����
		// int arr = {10, 24, 7, 16, 10};

		// ����� ������ ���ٷ� ǥ�� �� �� �ִ�.

		// �迭 arr�� ����ִ� ��� ������ ���� ���
		// ��� : 67
		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 24;
		arr[2] = 7;
		arr[3] = 16;
		arr[4] = 10;

		// 1���� �迭 : ���� for��
		// 2���� �迭 : 2�� for��
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} //for

		System.out.println(sum);
		
		System.out.println("-------------------------------------");
		
		char[] cArr = {'J', 'A', 'V', 'A','!'};
		// char[] cArr = new char[5];
		// char[0] = 'J';
		// ...
		
		//for(int i = 0; i<cArr.length; i++) {
		//	System.out.println(cArr[i]);
		//}
		
		/*
		 	������ roof(���� for��)
		 	// �迭�� ��� ��� ���뿡 �����ϰ��� �ϴ� �������� ������� for��
		 */
		for( char c : cArr ) {
			System.out.print(c);
		}
		
		
		

	}// main
}
