package ex2_work;

import java.util.Scanner;

public class Ex2_work { 
	public static void main(String[] args) {

		// 마방진
		// 키보드에서 입력받은 값 만큼의 행과 열을 가지는 마방진 만들기

		// 사이즈 : 3 (홀수)
		// 08 01 06
		// 03 05 07
		// 04 09 02
		Scanner sc = new Scanner(System.in);
	
		
//		 선생님 식
		int[][] arr; //크기를 지정하지 않음
		
		//시작 자리를 잡고 시작하는게 편함
		int num = 1; // 시작수
		int y = 0; // 세로줄(행) 변수
		int x = 0; // 가로줄(열) 변수
		
		System.out.print("사이즈: ");
		int size = sc.nextInt();
		
		x = size / 2;  //1을 가운데에 찍기 위해_
		
		// 배열의 크기 
		arr = new int[size][size];
		
		// 마방진을 그릴 while문
		while(num <= size * size ) {
			
			arr[y][x] = num; // 규칙에 맞춰서 수를 채우는 방식
			
			if( num % size == 0) { // 찍어야하는수가 마방진 사이즈의 배수인지?
				y++;
				
			}else {  //배수가아닐때
				y--;
				x++;
			}
			if( y < 0 ) { //위쪽칸 없을 때
				y = size - 1;
			}
			if( x >= size) { //오른쪽 칸 없을 떄
				x = 0;
			}
			
			num++;

		}
		
		// arr배열에 담긴 모든값을 출력
		for(int i=0; i<size; i++) {
			
			for(int j = 0; j<size; j++) {
				
				System.out.printf("%02d　 ",arr[i][j]);
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("----------------------------------------------");
//		// 내 식
//		
//		int a = sc.nextInt();
//		int[][] b = new int[a][a];
//		int i = 0, j = a / 2, v = 1; // 넣을값
////		b[0][a/2]=c++; //시작값 첫행 한가운데 두기
////		for (int i = a-1; i >=0 ; i--) { // 2 1 0 
////			for (int j = 0; j < a; j++) { // 0 1 2 
////				b[i][j] = c++;
////			}
////			System.out.println();
////		}
//		while (true) { // 무한루프
//			if (i < 0)
//				i = a - 1; // 행이 첫행보다 작아지는 경우 마지막으로 넘어간다.
//			if (j == a)
//				j = 0; // 열이 마지막열보다 커지는 경우 첫 열로 넘어간다.
//			if (b[i][j] == 0) {
//				b[i][j] = v;
//			}
//			if (v % a == 0) {// 넣은 수가 배수이면 행만 증가
//				i++;
//			} else {
//				i--;// 2 1 1 2
//				j++;// 2 0 0 0
//			}
//			v++;
//			if (v == a * a + 1)
//				break;// 종료조건
//		} // while
//
//		for (int k = 0; k < a; k++) {
//			for (int k2 = 0; k2 < a; k2++) {
//				System.out.print(b[k][k2]);
//			}
//			System.out.println();
//		}
		System.out.println("----------------------------------------------");
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("몇사이즈 마방진을 만드시겠습니까? ");
//		int num = sc.nextInt();
//
//		int[][] arr = new int[num][num];
//		int res = 0 ;
//		int [] arr2  = new int[num*num];
//		arr2[] = res+1;
//		
//		arr[0][num / 2] = 1;
//		int mult = num * num;
//
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = 0; j < arr[i].length; j++) {
//
//				if (mult % num == 0 && i + 1 < num) { // num의 배수일 때
//					arr[i][j] = arr[i + 1][j];
//
//				} else if (mult % num != 0) { // num의 배수가 아닐 때
//					arr[i][j] = arr[i - 1][j + 1]; // 위로 한칸 오른쪽으로 한칸
//
//					if (j - num == -1) { // 오른쪽 칸이 없을 때
//						arr[i][j] = arr[i][j - num];
//					}
//					if (i == 0) { // 위쪽 칸이 없을 때
//						arr[i][j] = arr[i - 1][j];
//					}
//				}
//				System.out.printf("arr[i][j]\t", arr[i][j]);
//				
//			}//inner
//
//			System.out.println();
//
//		}//outer
//		

	}// main
}
