package ex1_multi_array;

public class Ex3_multi_array {
	public static void main(String[] args) {

		// 작은 방의 갯수 지정

		int[][] num = new int[2][]; // 큰방은 2개인데 작은 방의 갯수는 못정했어
		num[0] = new int[3]; // 큰 0번 방은 작은 방 3개
		num[1] = new int[2]; // 큰 1번 방은 작은 방 2개

		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;

		num[1][0] = 40;
		num[1][1] = 50;

		// num 배열의 모든 값 출력
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 0; j < num[i].length; j++) {
				
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}// main
}
