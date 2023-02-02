package ex3_work;

public class Ex2_work {
	public static void main(String[] args) {

		// 배열 arr에 담긴 값 중 가장 큰 값을 출력
		// 결과 : 17

//		int[] arr = new int[6];
//
//		arr[0] = 214546;
//		arr[1] = 4;
//		arr[2] = 17;
//		arr[3] = 6;
//		arr[4] = 14456;
//		arr[5] = 15;

		int[] arr = { 214546, 4, 17, 6, 14456, 15};
		int max = arr[0];
		
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}//for
		
		System.out.println("가장 큰 값 : " + max);
		
		System.out.println("-------------------");
		
		//arr이 가진 값을 오른차순으로 정렬
		for( int i = 0; i < arr.length; i++ ) {
			
			//swap 을 이용해서 정렬 만들기
			for (int j = i; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
				
			}//inner
			
		}//outer
		
		
//		int num = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (num < arr[i]) {
//				num = arr[i];
//			}
//
//		}
//		System.out.println(num);
	}
}
