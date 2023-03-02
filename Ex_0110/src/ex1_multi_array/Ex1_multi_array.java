package ex1_multi_array;

public class Ex1_multi_array {
	
	public static void main(String[] args) {
		
		//1차원 배열의 선언과 생성과 초기화를 동시에 하는 법 
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		
		
		// 다차원 배열
		// 1차원 배열이 2개 모이면 2차원 배열
		// 1차원 배열이 3개 모이면 3차원 배열
		int[][] test = new int[2][3]; // 큰방 2개 작은 방 3개
		
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;
		
		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;
		
		System.out.println(test[0][1]); //20
		
		System.out.println(test[1][1]); //50
		
		
		System.out.println("------------------------------------");
		// 2차원 배열의 모든 값을 출력할 땐 2중 for문이 필요!
		
		//test.length -> 큰 방의 갯수
		for(int i = 0; i<test.length; i++) {
			
//	중요!!!// test[i].length -> 각 큰방에 포함되어 있는 작은 방의 갯수
			for(int j = 0; j<test[i].length; j++) {
			
				System.out.printf("%d ", test[i][j]);
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		for(int i = 0; i< test.length; i++) {
			for(int j = 0; j< test[i].length; j++) {
				System.out.print(test[i][j]);
			}
			System.out.println();
		}
		
		
	}//main

}


























