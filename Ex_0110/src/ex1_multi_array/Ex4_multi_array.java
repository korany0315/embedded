package ex1_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {

		//2차원 배열 arr에 담긴 모든 값의 합과 평균을 출력
		// 총 합 : 36
		// 평 균 : 2.1 ( 평균은 소수점 한자리 까지 출력)
		
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
//				index++;  //핵심 포인트!
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
