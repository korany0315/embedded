package ex1_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {

		//2���� �迭 arr�� ��� ��� ���� �հ� ����� ���
		// �� �� : 36
		// �� �� : 2.1 ( ����� �Ҽ��� ���ڸ� ���� ���)
		
		int[][] arr = { {0, 3, 1, 5},
						{6, 2, 1},
						{1, 2, 3, 4},
						{2, 0, 1, 1, 0, 4}	};
		
		int sum =0;
		float avg = 0;
		int count = 0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				sum += arr[i][j];
				count++;
				
			}
		}
		
		System.out.println(sum);
		avg = sum/(float)count;
		System.out.printf("%.1f", avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int sum = 0;
//		int index = 0;
//		for(int i = 0; i<arr.length; i++) {
//			
//			for(int j = 0; j<arr[i].length; j++) {
//				
//			
//				sum += arr[i][j];
//				
//				index++;  //�ٽ� ����Ʈ!
//				
//			}//inner
//			
//		}//outer
//		
//		System.out.println(sum);
//		
//		
//		System.out.printf("%.1f ",sum/(float)index);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main
}
