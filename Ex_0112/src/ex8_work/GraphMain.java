package ex8_work;

import java.util.Random;

public class GraphMain {

		public static void main(String[] args) {
			
			// 0 ~ 9 사이의 난수를 100개 만들어서 저장
			
			// 12847830584375394875309485304857....
			// 0의 개수 : ###### 6
			// 1의 개수 : ######### 9
			// ...
			// 9의 개수 : #### 4
			
			// 난수를 만드는건 메인
			// 그래프를 만드는건 클래스
			
			
			//풀이
			
			//랜덤만들기
			Random rnd = new Random();
			
			//0번 부터 9번 방의 배열 (10개의 방) 처음에 모두0으로 시작
			int[] nArr = new int[10];
			for( int i = 0; i<100; i++ ) {
				int r = rnd.nextInt(10);
				System.out.print(r);
				
				//핵심 난수가 늘어날때마다 nArr배열의 방 해당 숫자의 값을 늘려나가기!
				nArr[r]++; 
				
			}
			System.out.println();
			// 배열의 모든방에 있는 값을 다 담고 나옴
			
			//메서드 출력
			PrintGraph pg = new PrintGraph();
			pg.print(nArr);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}//main
}
